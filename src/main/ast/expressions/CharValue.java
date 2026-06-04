package main.ast.expressions; // change

import main.visitor.IVisitor;

public class CharValue extends Expression {
    private char value;

    public CharValue(char value) {
        this.value = value;
    }

    public char getValue() { return value; }
    public void setValue(char value) { this.value = value; }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}