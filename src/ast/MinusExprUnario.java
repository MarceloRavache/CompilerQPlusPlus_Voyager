package ast;

public class MinusExprUnario extends TreeNode{
    private final OperadorUnarioEnum op;
    public MinusExprUnario(OperadorUnarioEnum op){
        this.op = op;
    }
}
