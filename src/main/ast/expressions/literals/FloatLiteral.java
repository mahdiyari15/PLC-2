package main.ast.expressions.literals;

import main.ast.expressions.Expression;
import main.visitor.IVisitor;

public class FloatLiteral extends Expression {
    private final float floatValue;

    public FloatLiteral(float floatValue) {
        this.floatValue = floatValue;
    }

    public float getValue() {
        return this.floatValue;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}