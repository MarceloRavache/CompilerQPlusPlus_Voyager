package ast;

public class GtExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public GtExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
