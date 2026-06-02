import main.ast.core.Program;

import java.io.IOException;
import main.grammar.SimpleLangLexer;
import main.grammar.SimpleLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class SimpleLang {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);

        SimpleLangLexer lexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleLangParser parser = new SimpleLangParser(tokens);

        Program program = parser.program().programRet;

        System.out.println();

        TestVisitor testVisitor = new TestVisitor();
        PrintVisitor printVisitor = new PrintVisitor();
        testVisitor.visit(program);
        printVisitor.visit(program);
        System.out.println();
    }
}