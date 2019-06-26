package ast;

public class MinusExprBinario extends TreeNode{
    private final OperadorBinarioEnum op;
    public final MinusExprBinario(OperadorBinarioEnum op){
        this.op = op;
    }
}
