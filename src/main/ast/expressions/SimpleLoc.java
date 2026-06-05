package main.ast.expressions;

import main.ast.types.Identifier;
import main.visitor.IVisitor;

public class SimpleLoc extends Location {
    private final Identifier locationName;

    public SimpleLoc(Identifier locationName) {
        this.locationName = locationName;
    }

    public Identifier getName() {
        return this.locationName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}