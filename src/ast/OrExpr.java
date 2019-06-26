package ast;

public class OrExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public OrExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
