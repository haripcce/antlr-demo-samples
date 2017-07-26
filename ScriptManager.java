import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import antlr.Token;

public class TestLexer {

    public static void main(String[] args) throws Exception {
        System.out.println("Parsing: " + args[0]);

        Reader reader = new BufferedReader(new FileReader(args[0]));
        ScriptLexer lexer = new ScriptLexer(reader);

        Token token = lexer.nextToken();
        while(token.getType() != ScriptLexerTokenTypes.EOF) {
            System.out.println("\t" + getTokenType(token.getType()) + "\t\t" + token.getText());
            token = lexer.nextToken();
        }
    }

    private static String getTokenType(int tokenType) {
        switch(tokenType) {
        case ScriptLexerTokenTypes.STRING: return "STRING";
        case ScriptLexerTokenTypes.LBRACE: return "LBRACE";
        case ScriptLexerTokenTypes.RBRACE: return "RBRACE";
        case ScriptLexerTokenTypes.EQUALS: return "EQUALS";
        case ScriptLexerTokenTypes.SEMI: return "SEMI";
        default: return "OTHER";
        }
    }

}
