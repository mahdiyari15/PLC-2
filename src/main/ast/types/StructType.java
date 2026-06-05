package main.ast.types;
import main.visitor.IVisitor;
public class StructType extends Type {
    private Identifier structName;
    public StructType(Identifier structName) { this.structName = structName; }
    public Identifier getStructName() { return structName; }
    @Override public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }
}
 