package main.ast.expressions.literals;

import main.ast.expressions.Expression;
import main.visitor.IVisitor;

public class IntLiteral extends Expression {
    private final int integerValue;

    public IntLiteral(int integerValue) {
        this.integerValue = integerValue;
    }

    public int getValue() {
        return this.integerValue;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}