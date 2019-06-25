package ast;

public class ReturnExpr extends ExpressaoComando{
    private final Expression expression;
    public ReturnExpr(Expression expression){
        this.expression = expression;
    }
}
