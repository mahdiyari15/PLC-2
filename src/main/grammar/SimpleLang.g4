grammar SimpleLang;

@header {
    package main.grammar;
    import main.ast.core.*;
    import main.ast.declarations.*;
    import main.ast.declarations.Module;
    import main.ast.statements.*;
    import main.ast.expressions.*;
    import main.ast.expressions.literals.*;
    import main.ast.types.*;
}
 
// --- ENTRY POINT ---
program returns [Program programRet]
    :
        { $programRet = new Program(); }
        (currentDecl=topLevelDecl { $programRet.addTopLevelDeclaration($currentDecl.topLevelDeclRet); })*
        EOF
    ;

topLevelDecl returns [TopLevelDecl topLevelDeclRet]
    :
        moduleNode=module { $topLevelDeclRet = $moduleNode.moduleRet; }
    |
        structNode=structDef { $topLevelDeclRet = $structNode.structRet; }
    ;

module returns [Module moduleRet]
    :
        KW_MODULE
        moduleIdent=ID
        { 
          $moduleRet = new Module(new Identifier($moduleIdent.text));
          $moduleRet.setLine($moduleIdent.line); 
        }
        (KW_INCLUDES incId1=ID { $moduleRet.addInclude(new Identifier($incId1.text)); } (COMMA incId2=ID { $moduleRet.addInclude(new Identifier($incId2.text)); } )*)?
        KW_BEGIN
        (currentMember=member { $moduleRet.addMember($currentMember.memberRet); })*
        KW_END
    ;

structDef returns [Struct structRet]
    :
        KW_STRUCT
        structIdent=ID
        { 
          $structRet = new Struct(new Identifier($structIdent.text));
          $structRet.setLine($structIdent.line); 
        }
        KW_BEGIN
        (currentMember=member { $structRet.addMember($currentMember.memberRet); })*
        KW_END
    ;

member returns [Member memberRet]
    :
        accessKind=accessModifier targetMethod=method_decl 
        {
            MethodDecl methodDeclarationWrapper = new MethodDecl();
            methodDeclarationWrapper.setMethod($targetMethod.methodRet);
            methodDeclarationWrapper.setAccessModifier($accessKind.accessModifierRet);
            $memberRet = methodDeclarationWrapper;
        }
    | 
        targetMethod=method_decl 
        {
            MethodDecl methodDeclarationWrapper = new MethodDecl();
            methodDeclarationWrapper.setMethod($targetMethod.methodRet);
            $memberRet = methodDeclarationWrapper;
        }
    | 
        accessKind=accessModifier targetVar=vardecl SEMI 
        {
            VarDecl variableDeclarationWrapper = new VarDecl();
            variableDeclarationWrapper.setVar($targetVar.varRet);
            variableDeclarationWrapper.setAccessModifier($accessKind.accessModifierRet);
            $memberRet = variableDeclarationWrapper;
        }
    | 
        targetVar=vardecl SEMI 
        {
            VarDecl variableDeclarationWrapper = new VarDecl();
            variableDeclarationWrapper.setVar($targetVar.varRet);
            $memberRet = variableDeclarationWrapper;
        }
    ;

accessModifier returns [AccessModifier accessModifierRet]
    :
        KW_PRIVATE { $accessModifierRet = AccessModifier.PRIVATE; }
    |
        KW_PUBLIC  { $accessModifierRet = AccessModifier.PUBLIC; }
    ;

method_decl returns [Method methodRet]
    :
        returnType=type
        methodIdent=ID
        LPAREN
        methodArgs=arguments
        RPAREN
        methodBody=block
        { 
          $methodRet = new Method($returnType.typeRet, new Identifier($methodIdent.text), $methodArgs.parametersRet, $methodBody.blockRet);
          $methodRet.setLine($methodIdent.line); 
        }
    ;

arguments returns [List<Parameter> parametersRet]
    :
        { $parametersRet = new ArrayList<>(); }
        (p1=parameter { $parametersRet.add($p1.parameterRet); } (COMMA p2=parameter { $parametersRet.add($p2.parameterRet); } )*)?
    ;

parameter returns [Parameter parameterRet]
    :
        { boolean parameterIsMutable = false; }
        (KW_MUT { parameterIsMutable = true; })?
        paramType=type
        paramIdent=ID
        { 
          $parameterRet = new Parameter(parameterIsMutable, $paramType.typeRet, new Identifier($paramIdent.text));
          $parameterRet.setLine($paramIdent.line); 
        }
    ;

type returns [Type typeRet]
    :
        KW_INT { $typeRet = new IntType(); $typeRet.setLine($KW_INT.line); }
    |   KW_FLOAT { $typeRet = new FloatType(); $typeRet.setLine($KW_FLOAT.line); }
    |   KW_DOUBLE { $typeRet = new DoubleType(); $typeRet.setLine($KW_DOUBLE.line); }
    |   KW_CHAR { $typeRet = new CharType(); $typeRet.setLine($KW_CHAR.line); }
    |   KW_BOOL { $typeRet = new BoolType(); $typeRet.setLine($KW_BOOL.line); }
    |   KW_VOID { $typeRet = new VoidType(); $typeRet.setLine($KW_VOID.line); }
    |   customTypeName=ID { $typeRet = new StructType(new Identifier($customTypeName.text)); $typeRet.setLine($customTypeName.line); }
    ;

vardecl returns [Var varRet]
    :
        { boolean varIsMutable = false; }
        (KW_MUT { varIsMutable = true; })?
        (varType=type { $varRet = new Var(varIsMutable, $varType.typeRet); } 
        | varCons=cons { $varRet = new Var(varIsMutable, $varCons.constructorCallRet); })
        varIdent=ID
        { 
          $varRet.setName(new Identifier($varIdent.text));
          $varRet.setLine($varIdent.line); 
        }
    ;

cons returns [ConstructorCall constructorCallRet]
    :
        classIdent=ID
        { $constructorCallRet = new ConstructorCall(new Identifier($classIdent.text)); }
        LPAREN
        (arg1=expr { $constructorCallRet.addArgument($arg1.expressionRet); } (COMMA arg2=expr { $constructorCallRet.addArgument($arg2.expressionRet); } )*)?
        RPAREN
        { $constructorCallRet.setLine($classIdent.line); }
    ;

block returns [Block blockRet]
    :
        { $blockRet = new Block(); }
        startKey=KW_BEGIN
        (currentStmt=st { $blockRet.addStatement($currentStmt.statementRet); })*
        KW_END
        { $blockRet.setLine($startKey.line); }
    ;

st returns [Statement statementRet]
    :
        innerBlock=block
        { 
          $statementRet = $innerBlock.blockRet; 
          $statementRet.setLine($innerBlock.blockRet.getLine()); 
        }
    |
        singleVar=vardecl SEMI
        { 
          $statementRet = new VarDeclStmt($singleVar.varRet); 
          $statementRet.setLine($singleVar.varRet.getLine()); 
        }
    |
        initVar=vardecl ASSIGN targetExpr=expr SEMI
        { 
          $statementRet = new VarDeclStmt($initVar.varRet); 
          ((VarDeclStmt)$statementRet).setInitial($targetExpr.expressionRet);
          $statementRet.setLine($targetExpr.expressionRet.getLine()); 
        }
    |
        callStmt=methodcall SEMI
        { 
          $statementRet = new MethodCallStmt($callStmt.methodCallRet); 
          $statementRet.setLine($callStmt.methodCallRet.getLine()); 
        }
    |
        conditional=ifStmt
        { 
          $statementRet = $conditional.ifStmtRet; 
          $statementRet.setLine($conditional.ifStmtRet.getLine()); 
        }
    |
        assignment=assignStmt
        { 
          $statementRet = $assignment.assignStmtRet; 
          $statementRet.setLine($assignment.assignStmtRet.getLine()); 
        }
    |
        retStmt=returnStmt
        { 
          $statementRet = $retStmt.returnStmtRet; 
          $statementRet.setLine($retStmt.returnStmtRet.getLine()); 
        }
    |
        inStmt=inputStmt
        { 
          $statementRet = $inStmt.inputStmtRet; 
          $statementRet.setLine($inStmt.inputStmtRet.getLine()); 
        }
    |
        outStmt=outputStmt
        { 
          $statementRet = $outStmt.outputStmtRet; 
          $statementRet.setLine($outStmt.outputStmtRet.getLine()); 
        }
    |
        flowJump=jumpStmt
        { 
          $statementRet = $flowJump.jumpStmtRet; 
          $statementRet.setLine($flowJump.jumpStmtRet.getLine()); 
        }
    |
        loopFor=forStmt
        { 
          $statementRet = $loopFor.forStmtRet; 
          $statementRet.setLine($loopFor.forStmtRet.getLine()); 
        }
    |
        loopWhile=whileStmt
        { 
          $statementRet = $loopWhile.whileStmtRet; 
          $statementRet.setLine($loopWhile.whileStmtRet.getLine()); 
        }
    ;

jumpStmt returns [JumpStmt jumpStmtRet]
    :
        KW_BREAK { $jumpStmtRet = new BreakJump(); $jumpStmtRet.setLine($KW_BREAK.line); }
    |
        KW_CONTINUE { $jumpStmtRet = new ContinueJump(); $jumpStmtRet.setLine($KW_CONTINUE.line); }
    ;

ifStmt returns [IfStmt ifStmtRet]
    :
        startKey=KW_IF
        LPAREN
        condExpr=expr
        RPAREN
        thenBranch=st
        { $ifStmtRet = new IfStmt($condExpr.expressionRet, $thenBranch.statementRet); }
        (KW_ELSE elseBranch=st { $ifStmtRet.setElseBranch($elseBranch.statementRet); })?
        { $ifStmtRet.setLine($startKey.line); }
    ;

forStmt returns [ForStmt forStmtRet]
    :
        startKey=KW_FOR
        { 
          $forStmtRet = new ForStmt(); 
          $forStmtRet.setLine($startKey.line); 
        }
        LPAREN
        (init1=initexpr { $forStmtRet.addInit($init1.initExprRet); } (COMMA init2=initexpr { $forStmtRet.addInit($init2.initExprRet); })*)?
        SEMI
        (loopCond=expr { $forStmtRet.setCondition($loopCond.expressionRet); })?
        SEMI
        (updateLoc1=loc eqKey1=ASSIGN updateExpr1=expr 
        { 
          AssignStmt loopUpdate1 = new AssignStmt($updateLoc1.locationRet, $updateExpr1.expressionRet); 
          loopUpdate1.setLine($eqKey1.line); 
          $forStmtRet.addUpdate(loopUpdate1); 
        } 
        (COMMA updateLoc2=loc eqKey2=ASSIGN updateExpr2=expr 
        { 
          AssignStmt loopUpdate2 = new AssignStmt($updateLoc2.locationRet, $updateExpr2.expressionRet); 
          loopUpdate2.setLine($eqKey2.line); 
          $forStmtRet.addUpdate(loopUpdate2); 
        })*)?
        RPAREN
        bodyStmt=st
        { $forStmtRet.setBody($bodyStmt.statementRet); }
    ;

whileStmt returns [WhileStmt whileStmtRet]
    :
        startKey=KW_WHILE
        LPAREN
        loopCond=expr
        RPAREN
        bodyStmt=st
        { 
          $whileStmtRet = new WhileStmt($loopCond.expressionRet, $bodyStmt.statementRet); 
          $whileStmtRet.setLine($startKey.line); 
        }
    ;

assignStmt returns [AssignStmt assignStmtRet]
    :
        targetLoc=loc
        eqKey=ASSIGN
        sourceExpr=expr
        { $assignStmtRet = new AssignStmt($targetLoc.locationRet, $sourceExpr.expressionRet); }
        SEMI
        { $assignStmtRet.setLine($eqKey.line); }
    ;

returnStmt returns [ReturnStmt returnStmtRet]
    :
        { $returnStmtRet = new ReturnStmt(); }
        startKey=KW_RETURN
        (retExpr=expr { $returnStmtRet.setValue($retExpr.expressionRet); })?
        SEMI
        { $returnStmtRet.setLine($startKey.line); }
    ;

inputStmt returns [InputStmt inputStmtRet]
    :
        startKey=KW_INPUT
        targetLoc=loc
        { $inputStmtRet = new InputStmt($targetLoc.locationRet); }
        SEMI
        { $inputStmtRet.setLine($startKey.line); }
    ;

outputStmt returns [OutputStmt outputStmtRet]
    :
        startKey=KW_OUTPUT
        targetExpr=expr
        { $outputStmtRet = new OutputStmt($targetExpr.expressionRet); }
        SEMI
        { $outputStmtRet.setLine($startKey.line); }
    ;

loc returns [Location locationRet]
    :
        s=simpleLoc { $locationRet = $s.simpleLocRet; }
    |
        m=memberLoc { $locationRet = $m.memberLocRet; }
    |
        t=thisLoc 
        { 
          $locationRet = $t.thisLocRet; 
          $locationRet.setLine($t.thisLocRet.getLine()); 
        }
    ;

simpleLoc returns [SimpleLoc simpleLocRet]
    :
        identNode=ID
        { $simpleLocRet = new SimpleLoc(new Identifier($identNode.text)); }
        { $simpleLocRet.setLine($identNode.line); }
    ;

memberLoc returns [MemberLoc memberLocRet]
    :
        parentIdent=ID
        DOT
        childLoc=loc
        { $memberLocRet = new MemberLoc(new Identifier($parentIdent.text), $childLoc.locationRet); }
        { $memberLocRet.setLine($parentIdent.line); }
    ;

thisLoc returns [ThisLoc thisLocRet]
    :
        { $thisLocRet = new ThisLoc(); }
        startKey=KW_THIS
        (DOT childLoc=loc { $thisLocRet.setLoc($childLoc.locationRet); })?
        { $thisLocRet.setLine($startKey.line); }
    ;

methodcall returns [MethodCall methodCallRet]
    :
        { $methodCallRet = new MethodCall(); }
        (instanceLoc=loc DOT { $methodCallRet.setInstance($instanceLoc.locationRet); })?
        calleeIdent=ID
        { $methodCallRet.setCallee(new Identifier($calleeIdent.text)); }
        LPAREN
        (exprArg1=expr { $methodCallRet.addArgument($exprArg1.expressionRet); }
         (COMMA exprArg2=expr { $methodCallRet.addArgument($exprArg2.expressionRet); })*)?
        RPAREN
        { $methodCallRet.setLine($calleeIdent.line); }
    ;

expr returns [Expression expressionRet]
    :   currentLoc=loc { $expressionRet = $currentLoc.locationRet; }
    |   startKey=KW_THIS { $expressionRet = new ThisExpr(); $expressionRet.setLine($startKey.line); }
    |   mCall=methodcall { $expressionRet = $mCall.methodCallRet; }
    |   cCall=cons { $expressionRet = $cCall.constructorCallRet; }
    |   LPAREN innerExpr=expr RPAREN { $expressionRet = $innerExpr.expressionRet; }
    |   litInt=CONSTINT { $expressionRet = new IntLiteral(Integer.parseInt($litInt.text)); $expressionRet.setLine($litInt.line); }
    |   litFloat=CONSTFLOAT { $expressionRet = new FloatLiteral(Float.parseFloat($litFloat.text)); $expressionRet.setLine($litFloat.line); }
    |   litDouble=CONSTDOUBLE { $expressionRet = new DoubleLiteral(Double.parseDouble($litDouble.text)); $expressionRet.setLine($litDouble.line); }
    |   litChar=CONSTCHAR { $expressionRet = new CharLiteral($litChar.text.charAt(1)); $expressionRet.setLine($litChar.line); }
    |   litBool=CONSTBOOL { $expressionRet = new BoolLiteral(Boolean.parseBoolean($litBool.text)); $expressionRet.setLine($litBool.line); }
    |   unaryOp=(MINUS | KW_NOT) targetExpr=expr 
        {
            UnaryOperator finalOp = $unaryOp.type == MINUS ? UnaryOperator.MINUS : UnaryOperator.NOT;
            $expressionRet = new UnaryExpression(finalOp, $targetExpr.expressionRet);
            $expressionRet.setLine($unaryOp.line);
        }
    |   leftMul=expr mulOp=(STAR | SLASH) rightMul=expr 
        {
            BinaryOperator finalOp = $mulOp.type == STAR ? BinaryOperator.MULT : BinaryOperator.DIV;
            $expressionRet = new BinaryExpression($leftMul.expressionRet, $rightMul.expressionRet, finalOp);
            $expressionRet.setLine($leftMul.expressionRet.getLine());
        }
    |   leftAdd=expr addOp=(PLUS | MINUS) rightAdd=expr 
        {
            BinaryOperator finalOp = $addOp.type == PLUS ? BinaryOperator.PLUS : BinaryOperator.MINUS;
            $expressionRet = new BinaryExpression($leftAdd.expressionRet, $rightAdd.expressionRet, finalOp);
            $expressionRet.setLine($leftAdd.expressionRet.getLine());
        }
    |   leftRel=expr relOp=(LESS | GREATER | LESS_EQ | GREATER_EQ) rightRel=expr 
        {
            BinaryOperator finalOp = null;
            if ($relOp.type == LESS) finalOp = BinaryOperator.LESS;
            else if ($relOp.type == GREATER) finalOp = BinaryOperator.GREATER;
            else if ($relOp.type == LESS_EQ) finalOp = BinaryOperator.LESS_EQ;
            else if ($relOp.type == GREATER_EQ) finalOp = BinaryOperator.GREATER_EQ;
            $expressionRet = new BinaryExpression($leftRel.expressionRet, $rightRel.expressionRet, finalOp);
            $expressionRet.setLine($leftRel.expressionRet.getLine());
        }
    |   leftEq=expr eqOp=(EQUAL | NOT_EQUAL) rightEq=expr 
        {
            BinaryOperator finalOp = $eqOp.type == EQUAL ? BinaryOperator.EQUAL : BinaryOperator.NOT_EQUAL;
            $expressionRet = new BinaryExpression($leftEq.expressionRet, $rightEq.expressionRet, finalOp);
            $expressionRet.setLine($leftEq.expressionRet.getLine());
        }
    |   leftAnd=expr KW_AND rightAnd=expr 
        {
            $expressionRet = new BinaryExpression($leftAnd.expressionRet, $rightAnd.expressionRet, BinaryOperator.AND);
            $expressionRet.setLine($leftAnd.expressionRet.getLine());
        }
    |   leftOr=expr KW_OR rightOr=expr 
        {
            $expressionRet = new BinaryExpression($leftOr.expressionRet, $rightOr.expressionRet, BinaryOperator.OR);
            $expressionRet.setLine($leftOr.expressionRet.getLine());
        }
    ;

initexpr returns [Statement initExprRet]
    :
        initVar1=vardecl { $initExprRet = new VarDeclStmt($initVar1.varRet); $initExprRet.setLine($initVar1.varRet.getLine()); }
    |
        initLoc=loc ASSIGN targetExpr=expr
        { 
          $initExprRet = new AssignStmt($initLoc.locationRet, $targetExpr.expressionRet); 
          $initExprRet.setLine($initLoc.locationRet.getLine()); 
        }
    |
        initVar2=vardecl ASSIGN assignedExpr=expr
        { 
          $initExprRet = new VarDeclStmt($initVar2.varRet); 
          ((VarDeclStmt)$initExprRet).setInitial($assignedExpr.expressionRet);
          $initExprRet.setLine($initVar2.varRet.getLine()); 
        }
    ;

// --- LEXER RULES ---
KW_MODULE   : 'module' ;
KW_STRUCT   : 'struct' ;
KW_INCLUDES : 'includes' ;
KW_BEGIN    : 'begin' ;
KW_END      : 'end' ;
KW_PUBLIC   : 'public' ;
KW_PRIVATE  : 'private' ;
KW_INT      : 'int' ;
KW_FLOAT    : 'float' ;
KW_DOUBLE   : 'double' ;
KW_CHAR     : 'char' ;
KW_VOID     : 'void' ;
KW_IF       : 'if' ;
KW_ELSE     : 'else' ;
KW_FOR      : 'for' ;
KW_WHILE    : 'while' ;
KW_DO       : 'do' ;
KW_RETURN   : 'return' ;
KW_INPUT    : 'input' ;
KW_OUTPUT   : 'output' ;
KW_THIS     : 'this' ;
KW_NOT      : 'not' ;
KW_AND      : 'and' ;
KW_OR       : 'or' ;
KW_MUT      : 'mut' ;
KW_BREAK    : 'break' ;
KW_CONTINUE : 'continue' ;
KW_BOOL     : 'bool' ;

CONSTBOOL   : 'true' | 'false' ;
SEMI        : ';' ;
COMMA       : ',' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
LBRACK      : '[' ;
RBRACK      : ']' ;
ASSIGN      : '=' ;
DOT         : '.' ;
ARROW       : '->' ;
MINUS       : '-' ;
PLUS        : '+' ;
STAR        : '*' ;
SLASH       : '/' ;
AMPERSAND   : '&' ;
LESS        : '<' ;
GREATER     : '>' ;
LESS_EQ     : '<=' ;
GREATER_EQ  : '>=' ;
EQUAL       : '==' ;
NOT_EQUAL   : '!=' ;

CONSTINT    : DIGIT+ ;
CONSTFLOAT  : DIGIT+ DOT DIGIT+ ;
CONSTDOUBLE : DIGIT+ DOT DIGIT+ EXPONENT SIGN? DIGIT+ ;
CONSTCHAR   : '\'' . '\'' ;
ID          : LETTER (LETTER | DIGIT | '_')* ;

fragment LETTER   : [a-zA-Z] ;
fragment DIGIT    : [0-9] ;
fragment EXPONENT : [eE] ;
fragment SIGN     : [+\-] ;

WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '%%' ~[\r\n]* -> skip ;
MULTICOMMENT: '%%%' .*? '%%%' -> skip ;