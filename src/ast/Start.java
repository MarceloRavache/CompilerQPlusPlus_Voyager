package ast;
import java.util.ArrayList;

public class Start extends TreeNode {
    private final ArrayList<Statement> statements;

    public Start(ArrayList<Statement> statements)
    {
        this.statements = statements;
    }

    public Start()
    {
        statements = new ArrayList<>();
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Program]");
        for(Statement s : statements) {
            s.printAtDepth(depth+1);
        }
    }
}
