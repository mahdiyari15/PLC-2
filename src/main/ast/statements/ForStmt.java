package main.ast.statements; // change

import main.ast.expressions.Expression;
import java.util.List;
import main.visitor.IVisitor;

public class ForStmt extends Statement {
    private List<Statement> initialization;
    private Expression condition;
    private List<Statement> update;
    private Statement body;

    public ForStmt(List<Statement> initialization, Expression condition, List<Statement> update, Statement body) {
        this.initialization = initialization;
        this.condition = condition;
        this.update = update;
        this.body = body;
    }

    public List<Statement> getInitialization() { return initialization; }
    public void setInitialization(List<Statement> initialization) { this.initialization = initialization; }

    public Expression getCondition() { return condition; }
    public void setCondition(Expression condition) { this.condition = condition; }

    public List<Statement> getUpdate() { return update; }
    public void setUpdate(List<Statement> update) { this.update = update; }

    public Statement getBody() { return body; }
    public void setBody(Statement body) { this.body = body; }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}