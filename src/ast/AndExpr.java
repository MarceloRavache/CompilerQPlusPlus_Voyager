package ast;

public class AndExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public AndExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
