package main.ast.expressions;

import main.ast.types.Identifier;
import main.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;

public class ConstructorCall extends Expression {
    private final Identifier targetStructName;
    private final List<Expression> callArguments;

    public ConstructorCall(Identifier targetStructName) {
        this.targetStructName = targetStructName;
        this.callArguments = new ArrayList<>();
    }

    public void addArgument(Expression individualArg) {
        if (individualArg != null) {
            this.callArguments.add(individualArg);
        }
    }

    public Identifier getStructName() {
        return this.targetStructName;
    }

    public List<Expression> getArguments() {
        return this.callArguments;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}