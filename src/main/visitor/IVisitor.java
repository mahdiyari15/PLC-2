package main.visitor;

import main.ast.core.*;
import main.ast.declarations.Module;
import main.ast.types.*;
import main.ast.declarations.*;
import main.ast.statements.*;
import main.ast.expressions.*;

public interface IVisitor<T> {
    T visit(Program program);
    T visit(Module module);
    T visit(ModuleDecl moduleDecl);
    T visit(Struct struct);
    T visit(StructDecl structDecl);
    
    // change
    // Declarations & Core
    T visit(Method method);
    T visit(Parameter parameter);
    T visit(Var varDeclaration);
    T visit(Identifier identifier);

    // change
    // Statements
    T visit(AssignmentStmt assignmentStmt);
    T visit(Block block);
    T visit(BreakStmt breakStmt);
    T visit(ContinueStmt continueStmt);
    T visit(ForStmt forStmt);
    T visit(IfStmt ifStmt);
    T visit(InputStmt inputStmt);
    T visit(MethodCallStmt methodCallStmt);
    T visit(OutputStmt outputStmt);
    T visit(ReturnStmt returnStmt);
    T visit(VarDeclStmt varDeclStmt);
    T visit(WhileStmt whileStmt);

    // change
    // Expressions
    T visit(BinaryExpression binaryExpression);
    T visit(UnaryExpression unaryExpression);
    T visit(MethodCall methodCall);
    T visit(ConstructorCall constructorCall);
    T visit(SimpleIdentifier simpleIdentifier);
    T visit(FieldAccess fieldAccess);
    T visit(ThisAccess thisAccess);

    // change
    // Literals
    T visit(IntValue intValue);
    T visit(FloatValue floatValue);
    T visit(BoolValue boolValue);
    T visit(CharValue charValue);
    T visit(DoubleValue doubleValue);
    T visit(StringValue stringValue);
}