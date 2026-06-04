package main.visitor;

import main.ast.core.*;
import main.ast.declarations.Module;
import main.ast.types.*;
import main.ast.declarations.*;
import main.ast.statements.*;
import main.ast.expressions.*;

public abstract class Visitor<T> implements IVisitor<T> {
    @Override 
    public T visit(Program program) { return null; }
    @Override 
    public T visit(Module module) { return null; }
    @Override 
    public T visit(ModuleDecl moduleDecl) { return null; }
    @Override 
    public T visit(Struct struct) { return null; }
    @Override 
    public T visit(StructDecl structDecl) { return null; }
    // change
    @Override 
    public T visit(Method method) { return null; }
    @Override 
    public T visit(Parameter parameter) { return null; }
    @Override 
    public T visit(Var varDeclaration) { return null; }
    @Override 
    public T visit(Identifier identifier) { return null; }
    @Override
    public T visit(AssignStmt assignStmt) { return null; }
    @Override 
    public T visit(Block block) { return null; }
    @Override 
    public T visit(BreakJump breakJump) { return null; }
    @Override 
    public T visit(ContinueJump continueJump) { return null; }
    @Override 
    public T visit(ForStmt forStmt) { return null; }
    @Override 
    public T visit(IfStmt ifStmt) { return null; }
    @Override 
    public T visit(InputStmt inputStmt) { return null; }
    @Override 
    public T visit(MethodCallStmt methodCallStmt) { return null; }
    @Override 
    public T visit(OutputStmt outputStmt) { return null; }
    @Override 
    public T visit(ReturnStmt returnStmt) { return null; }
    @Override 
    public T visit(VarDeclStmt varDeclStmt) { return null; }
    @Override 
    public T visit(WhileStmt whileStmt) { return null; }
    @Override 
    public T visit(BinaryExpression binaryExpression) { return null; }
    @Override 
    public T visit(UnaryExpression unaryExpression) { return null; }
    @Override 
    public T visit(MethodCall methodCall) { return null; }
    @Override 
    public T visit(ConstructorCall constructorCall) { return null; }
    @Override 
    public T visit(SimpleIdentifier simpleIdentifier) { return null; }
    @Override 
    public T visit(FieldAccess fieldAccess) { return null; }
    @Override 
    public T visit(ThisAccess thisAccess) { return null; }
    @Override 
    public T visit(IntValue intValue) { return null; }
    @Override 
    public T visit(FloatValue floatValue) { return null; }
    @Override 
    public T visit(BoolValue boolValue) { return null; }
    @Override 
    public T visit(CharValue charValue) { return null; }
    @Override 
    public T visit(DoubleValue doubleValue) { return null; }
    @Override 
    public T visit(StringValue stringValue) { return null; }
}