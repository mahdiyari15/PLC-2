import main.visitor.Visitor;
import main.ast.core.*;
import main.ast.declarations.*;
import main.ast.declarations.Module;
import main.ast.statements.*;
import main.ast.types.*;

public class PrintVisitor extends Visitor<Void> {

    private int modulesCount = 0;
    private int structsCount = 0;

    private int currentFieldsCount = 0;
    private int currentMethodsCount = 0;

    private boolean isCountingPhase = false;

    @Override
    public Void visit(Program program) {
        isCountingPhase = true;
        modulesCount = 0;
        structsCount = 0;

        for (TopLevelDecl decl : program.getTopLevelDeclarations()) {
            decl.accept(this); 
        }

        isCountingPhase = false;
        System.out.println("program [modules:" + modulesCount + " structs:" + structsCount + "]");

        for (TopLevelDecl decl : program.getTopLevelDeclarations()) {
            decl.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Module module) {
        if (isCountingPhase) {
            modulesCount++; 
            return null;
        }

        currentFieldsCount = 0;
        currentMethodsCount = 0;
        
        isCountingPhase = true;
        for (Member member : module.getMembers()) {
            member.accept(this);
        }
        isCountingPhase = false; 

        System.out.println("\tmodule " + module.getName().getName() + " [methods:" + currentMethodsCount + " fields:" + currentFieldsCount + "]");

        for (Member member : module.getMembers()) {
            member.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ModuleDecl moduleDecl) {
        return moduleDecl.getModule().accept(this);
    }

    @Override
    public Void visit(Struct struct) {
        if (isCountingPhase) {
            structsCount++; 
            return null;
        }

        currentFieldsCount = 0;
        currentMethodsCount = 0;

        isCountingPhase = true;
        for (Member member : struct.getMembers()) {
            member.accept(this);
        }
        isCountingPhase = false;

        System.out.println("\tstruct " + struct.getName().getName() + " [fields:" + currentFieldsCount + "]");

        for (Member member : struct.getMembers()) {
            member.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(StructDecl structDecl) {
        return structDecl.getStruct().accept(this);
    }

    @Override
    public Void visit(VarDecl varDecl) {
        if (isCountingPhase) {
            currentFieldsCount++; 
            return null;
        }

        String name = varDecl.getVar().getName().getName();
        String accessMod = varDecl.getAccessModifier() != null ? varDecl.getAccessModifier().toString().toLowerCase() : "";

        String typeStr = "unknown";
        if (varDecl.getVar().getType() != null) {
            typeStr = getTypeStringWithoutInstanceof(varDecl.getVar().getType());
        } else if (varDecl.getVar().getConstructorCall() != null) {
            typeStr = varDecl.getVar().getConstructorCall().getStructName().getName();
        }

        String accessPart = accessMod.isEmpty() ? "" : ":" + accessMod;
        System.out.println("\t\tfield " + name + " " + typeStr + accessPart);
        return null;
    }

    @Override
    public Void visit(MethodDecl methodDecl) {
        if (isCountingPhase) {
            currentMethodsCount++; 
            return null;
        }

        Method method = methodDecl.getMethod();
        String name = method.getName().getName();
        String accessMod = methodDecl.getAccessModifier() != null ? methodDecl.getAccessModifier().toString().toLowerCase() : "";
        int stmtsCount = method.getBody().getStatements().size();

        StringBuilder argsBuilder = new StringBuilder();
        for (int i = 0; i < method.getParameters().size(); i++) {
            argsBuilder.append(getTypeStringWithoutInstanceof(method.getParameters().get(i).getType()));
            if (i < method.getParameters().size() - 1) {
                argsBuilder.append("*");
            }
        }
        String argsStr = argsBuilder.length() == 0 ? "void" : argsBuilder.toString();
        String retStr = getTypeStringWithoutInstanceof(method.getReturnType());

        String suffix;
        if (!accessMod.isEmpty()) {
            suffix = "):" + accessMod + " ";
        } else {
            suffix = ") ";
        }

        System.out.println("\t\tmethod " + name + " (" + argsStr + " -> " + retStr + suffix + "[statements:" + stmtsCount + "]");
        return null;
    }

    private String getTypeStringWithoutInstanceof(Type type) {
        if (type == null) return "unknown";
        TypeStringVisitor typeVisitor = new TypeStringVisitor();
        return type.accept(typeVisitor);
    }
}

class TypeStringVisitor extends Visitor<String> {
    @Override 
    public String visit(IntType intType) { 
        return "int"; 
    }
    
    @Override 
    public String visit(FloatType floatType) { 
        return "float"; 
    }
    
    @Override 
    public String visit(DoubleType doubleType) { 
        return "double"; 
    }
    
    @Override 
    public String visit(CharType charType) { 
        return "char"; 
    }
    
    @Override 
    public String visit(BoolType boolType) { 
        return "bool"; 
    }
    
    @Override 
    public String visit(VoidType voidType) { 
        return "void"; 
    }
    
    @Override 
    public String visit(StructType structType) { 
        return structType.getStructName().getName(); 
    }
}