package main.ast.expressions;

import main.visitor.IVisitor;

public class BinaryExpression extends Expression {
    private final Expression leftOperand;
    private final Expression rightOperand;
    private final BinaryOperator opType;

    public BinaryExpression(Expression leftOperand, Expression rightOperand, BinaryOperator opType) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.opType = opType;
    }

    public Expression getLeft() {
        return this.leftOperand;
    }

    public Expression getRight() {
        return this.rightOperand;
    }

    public BinaryOperator getOperator() {
        return this.opType;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}