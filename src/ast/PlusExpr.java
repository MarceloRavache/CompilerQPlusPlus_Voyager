package ast;

public class PlusExpr extends TreeNode {
    private final OperadorBinarioEnum op;
    public PlusExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
