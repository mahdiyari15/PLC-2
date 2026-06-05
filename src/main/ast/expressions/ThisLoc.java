package main.ast.expressions;

import main.visitor.IVisitor;

public class ThisLoc extends Location {
    private Location encapsulatedLocation;

    public ThisLoc() {
        super();
    }

    public Location getLoc() {
        return this.encapsulatedLocation;
    }

    public void setLoc(Location encapsulatedLocation) {
        this.encapsulatedLocation = encapsulatedLocation;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}