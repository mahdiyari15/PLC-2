package main.ast.expressions;

import main.ast.types.Identifier;
import main.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;

public class MethodCall extends Expression {
    private Location callingInstance;
    private Identifier methodCallee;
    private final List<Expression> callArguments;

    public MethodCall() {
        this.callArguments = new ArrayList<>();
    }

    public void setInstance(Location callingInstance) {
        this.callingInstance = callingInstance;
    }

    public void setCallee(Identifier methodCallee) {
        this.methodCallee = methodCallee;
    }

    public void addArgument(Expression structuralArg) {
        if (structuralArg != null) {
            this.callArguments.add(structuralArg);
        }
    }

    public Location getInstance() {
        return this.callingInstance;
    }

    public Identifier getCallee() {
        return this.methodCallee;
    }

    public List<Expression> getArguments() {
        return this.callArguments;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}