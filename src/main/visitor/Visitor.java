package main.visitor;

import main.ast.core.*;
import main.ast.declarations.*;
import main.ast.declarations.Module;
import main.ast.statements.*;
import main.ast.expressions.*;
import main.ast.expressions.literals.*;
import main.ast.types.*;

public abstract class Visitor<T> implements IVisitor<T> {
    
    @Override public T visit(Program nodeProgram) { return null; }
    @Override public T visit(Module nodeModule) { return null; }
    @Override public T visit(ModuleDecl moduleDeclaration) { return null; }
    @Override public T visit(Struct astStruct) { return null; }
    @Override public T visit(StructDecl structDeclaration) { return null; }
    @Override public T visit(Method astMethod) { return null; }
    @Override public T visit(MethodDecl methodDeclaration) { return null; }
    @Override public T visit(Parameter astParameter) { return null; }
    @Override public T visit(Var astVar) { return null; }
    @Override public T visit(VarDecl varDeclaration) { return null; }

    @Override public T visit(AssignStmt assignmentStatement) { return null; }
    @Override public T visit(Block codeBlock) { return null; }
    @Override public T visit(BreakJump breakStatement) { return null; }
    @Override public T visit(ContinueJump continueStatement) { return null; }
    @Override public T visit(ForStmt forLoopStatement) { return null; }
    @Override public T visit(IfStmt conditionalStatement) { return null; }
    @Override public T visit(InputStmt streamInputStatement) { return null; }
    @Override public T visit(MethodCallStmt invocationStatement) { return null; }
    @Override public T visit(OutputStmt streamOutputStatement) { return null; }
    @Override public T visit(ReturnStmt procedureReturnStatement) { return null; }
    @Override public T visit(VarDeclStmt variableDeclarationStatement) { return null; }
    @Override public T visit(WhileStmt whileLoopStatement) { return null; }

    @Override public T visit(BinaryExpression binExpr) { return null; }
    @Override public T visit(UnaryExpression unExpr) { return null; }
    @Override public T visit(ThisExpr selfExpression) { return null; }
    @Override public T visit(MethodCall functionCall) { return null; }
    @Override public T visit(ConstructorCall instantiationCall) { return null; }
    @Override public T visit(SimpleLoc basicLocation) { return null; }
    @Override public T visit(MemberLoc structuralMemberLocation) { return null; }
    @Override public T visit(ThisLoc selfReferencingLocation) { return null; }
    @Override public T visit(Identifier nodeIdentifier) { return null; }

    @Override public T visit(IntLiteral integerConstant) { return null; }
    @Override public T visit(FloatLiteral floatConstant) { return null; }
    @Override public T visit(DoubleLiteral doubleConstant) { return null; }
    @Override public T visit(CharLiteral characterConstant) { return null; }
    @Override public T visit(BoolLiteral booleanConstant) { return null; }

    @Override public T visit(IntType primitiveIntType) { return null; }
    @Override public T visit(FloatType primitiveFloatType) { return null; }
    @Override public T visit(DoubleType primitiveDoubleType) { return null; }
    @Override public T visit(CharType primitiveCharType) { return null; }
    @Override public T visit(BoolType primitiveBoolType) { return null; }
    @Override public T visit(VoidType proceduralVoidType) { return null; }
    @Override public T visit(StructType userDefinedStructType) { return null; }
}