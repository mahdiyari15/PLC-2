package main.ast.expressions.literals;

import main.ast.expressions.Expression;
import main.visitor.IVisitor;

public class DoubleLiteral extends Expression {
    private final double doubleValue;

    public DoubleLiteral(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public double getValue() {
        return this.doubleValue;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}