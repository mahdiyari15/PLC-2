package main.ast.statements;

import main.ast.expressions.Expression;
import main.visitor.IVisitor;

public class WhileStmt extends Statement {
    private Expression terminationCondition;
    private Statement executableBody;

    public WhileStmt(Expression terminationCondition, Statement executableBody) {
        this.terminationCondition = terminationCondition;
        this.executableBody = executableBody;
    }

    public Statement getBody() {
        return this.executableBody;
    }

    public void setBody(Statement executableBody) {
        this.executableBody = executableBody;
    }

    public Expression getCondition() {
        return this.terminationCondition;
    }

    public void setCondition(Expression terminationCondition) {
        this.terminationCondition = terminationCondition;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}