package main.visitor;

import main.ast.core.*;
import main.ast.declarations.*;
import main.ast.declarations.Module;
import main.ast.statements.*;
import main.ast.expressions.*;
import main.ast.expressions.literals.*;
import main.ast.types.*;

/**
 * Structural Visitor Interface governing AST node traversal operations.
 */
public interface IVisitor<T> {

    T visit(Program nodeProgram);

    T visit(Module nodeModule);

    T visit(ModuleDecl moduleDeclaration);

    T visit(Struct astStruct);

    T visit(StructDecl structDeclaration);

    T visit(Method astMethod);

    T visit(MethodDecl methodDeclaration);

    T visit(Parameter astParameter);

    T visit(Var astVar);

    T visit(VarDecl varDeclaration);

    T visit(AssignStmt assignmentStatement);

    T visit(Block codeBlock);

    T visit(BreakJump breakStatement);

    T visit(ContinueJump continueStatement);

    T visit(ForStmt forLoopStatement);

    T visit(IfStmt conditionalStatement);

    T visit(InputStmt streamInputStatement);

    T visit(MethodCallStmt invocationStatement);

    T visit(OutputStmt streamOutputStatement);

    T visit(ReturnStmt procedureReturnStatement);

    T visit(VarDeclStmt variableDeclarationStatement);

    T visit(WhileStmt whileLoopStatement);

    T visit(BinaryExpression binExpr);

    T visit(UnaryExpression unExpr);

    T visit(ThisExpr selfExpression);

    T visit(MethodCall functionCall);

    T visit(ConstructorCall instantiationCall);

    T visit(SimpleLoc basicLocation);

    T visit(MemberLoc structuralMemberLocation);

    T visit(ThisLoc selfReferencingLocation);

    T visit(Identifier nodeIdentifier);

    T visit(IntLiteral integerConstant);

    T visit(FloatLiteral floatConstant);

    T visit(DoubleLiteral doubleConstant);

    T visit(CharLiteral characterConstant);

    T visit(BoolLiteral booleanConstant);

    T visit(IntType primitiveIntType);

    T visit(FloatType primitiveFloatType);

    T visit(DoubleType primitiveDoubleType);

    T visit(CharType primitiveCharType);

    T visit(BoolType primitiveBoolType);

    T visit(VoidType proceduralVoidType);

    T visit(StructType userDefinedStructType);
}