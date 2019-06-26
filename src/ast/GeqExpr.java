package ast;

public class GeqExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public GeqExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
