package main.ast.expressions;

import main.visitor.IVisitor;

public class ThisExpr extends Expression {

    @Override
    public <T> T accept(IVisitor<T> targetVisitor) {
        return targetVisitor.visit(this);
    }
}