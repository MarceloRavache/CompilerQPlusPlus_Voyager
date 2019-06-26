package ast;

public class LtExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public LtExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
