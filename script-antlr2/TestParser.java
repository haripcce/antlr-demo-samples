import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import antlr.CommonAST;
import antlr.DumpASTVisitor;

public class TestParser {

    public static void main(String[] args) throws Exception {
      String path = "/home/synerzip/demo/script-antlr2/test.script";
        System.out.println("Parsing: " + path);

        Reader reader = new BufferedReader(new FileReader(path));
        ScriptLexer lexer = new ScriptLexer(reader);
        ScriptParser parser = new ScriptParser(lexer);
        parser.script();
        System.out.println(parser.getAST().toStringList());
      //  CommonAST ast = (CommonAST)parser.getAST();
      //  DumpASTVisitor visitor = new DumpASTVisitor();
      //  visitor.visit(ast);
    }
}
