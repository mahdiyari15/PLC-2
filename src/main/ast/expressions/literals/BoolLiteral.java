package main.ast.expressions.literals;

import main.ast.expressions.Expression;
import main.visitor.IVisitor;

public class BoolLiteral extends Expression {
    private final boolean booleanValue;

    public BoolLiteral(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public boolean getValue() {
        return this.booleanValue;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}