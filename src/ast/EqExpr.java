package ast;

public class EqExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public EqExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
