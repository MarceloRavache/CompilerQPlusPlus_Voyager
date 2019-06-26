package ast;

public class NotExpr extends TreeNode{
    private final OperadorUnarioEnum op;
    public NotExpr(OperadorUnarioEnum op){
        this.op = op;
    }
}
