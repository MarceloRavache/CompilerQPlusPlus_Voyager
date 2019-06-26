package ast;

public class ModExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public ModExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
