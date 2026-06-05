package main.ast.statements;

import main.ast.expressions.Expression;
import main.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;

public class ForStmt extends Statement {
    private final List<Statement> initStatements;
    private final List<AssignStmt> updateStatements;
    private Expression loopCondition;
    private Statement loopBody;

    public ForStmt() {
        this.initStatements = new ArrayList<>();
        this.updateStatements = new ArrayList<>();
    }

    public void addInit(Statement initBlock) {
        if (initBlock != null) {
            this.initStatements.add(initBlock);
        }
    }

    public void addUpdate(AssignStmt assignExpr) {
        if (assignExpr != null) {
            this.updateStatements.add(assignExpr);
        }
    }

    public List<Statement> getInitialize() {
        return this.initStatements;
    }

    public Expression getCondition() {
        return this.loopCondition;
    }

    public void setCondition(Expression loopCondition) {
        this.loopCondition = loopCondition;
    }

    public List<AssignStmt> getUpdate() {
        return this.updateStatements;
    }

    public Statement getBody() {
        return this.loopBody;
    }

    public void setBody(Statement loopBody) {
        this.loopBody = loopBody;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}