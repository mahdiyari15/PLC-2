package main.ast.expressions;

import main.visitor.IVisitor;

public class UnaryExpression extends Expression {
    private final UnaryOperator opKind;
    private final Expression targetOperand;

    public UnaryExpression(UnaryOperator opKind, Expression targetOperand) {
        this.opKind = opKind;
        this.targetOperand = targetOperand;
    }

    public UnaryOperator getOperator() {
        return this.opKind;
    }

    public Expression getOperand() {
        return this.targetOperand;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}