import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import comp.CompilerParser;
import comp.CompilerLexer;


public class Main {
    public static void main(String[] args) {
        CompilerLexer lexer = new CompilerLexer(CharStreams.fromString("void main(){int a =1;}"));
        CompilerParser parser = new CompilerParser(new CommonTokenStream(lexer));

        parser.start();
        System.out.println("My parser has executed Order 66");
    }
}