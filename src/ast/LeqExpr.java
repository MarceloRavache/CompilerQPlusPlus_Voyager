package ast;

public class LeqExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public LeqExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
