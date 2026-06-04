package main.ast.expressions; // change

import main.visitor.IVisitor;

public class DoubleValue extends Expression {
    private double value;

    public DoubleValue(double value) {
        this.value = value;
    }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}