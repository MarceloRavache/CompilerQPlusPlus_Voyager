package ast;

public class TimesExpr extends TreeNode{
    private final OperadorBinarioEnum op;
    public TimesExpr(OperadorBinarioEnum op){
        this.op = op;
    }
}
