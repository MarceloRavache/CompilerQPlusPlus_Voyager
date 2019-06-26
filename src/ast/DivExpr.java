package ast;

public class DivExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public DivExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
