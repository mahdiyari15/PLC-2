package main.ast.expressions.literals;

import main.ast.expressions.Expression;
import main.visitor.IVisitor;

public class CharLiteral extends Expression {
    private final char characterValue;

    public CharLiteral(char characterValue) {
        this.characterValue = characterValue;
    }

    public char getValue() {
        return this.characterValue;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}