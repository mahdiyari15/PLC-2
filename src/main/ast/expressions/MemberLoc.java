package main.ast.expressions;

import main.ast.types.Identifier;
import main.visitor.IVisitor;

public class MemberLoc extends Location {
    private final Identifier memberIdentifier;
    private final Location baseLocation;

    public MemberLoc(Identifier memberIdentifier, Location baseLocation) {
        this.memberIdentifier = memberIdentifier;
        this.baseLocation = baseLocation;
    }

    public Identifier getMemberName() {
        return this.memberIdentifier;
    }

    public Location getLoc() {
        return this.baseLocation;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}