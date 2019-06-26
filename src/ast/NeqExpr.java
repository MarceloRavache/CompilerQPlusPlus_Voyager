package ast;

public class NeqExpr extends TreeNode {
    private final OperadorBinarioEnum op;
    public NeqExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
