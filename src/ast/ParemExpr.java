package ast;

public class ParemExpr extends Expression{
    private final Expression expression;
    public ParemExpr(Expression expression){
        this.expression = expression;
    }
}
