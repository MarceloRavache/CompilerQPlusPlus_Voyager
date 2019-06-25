package ast;

public class BoolExpr extends Tipo{
    private final Qualificador quali;
    private final Decorador decor;
    public BoolExpr(Qualificador quali,Decorador decor){
        this.quali = quali;
        this.decor = decor;
    }
}
