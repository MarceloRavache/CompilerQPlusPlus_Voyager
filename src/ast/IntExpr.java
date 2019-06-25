package ast;


public class IntExpr extends Tipo{
    private final Qualificador quali;
    private final Decorador decor;
    public IntExpr(Qualificador quali,Decorador decor){
        this.quali = quali;
        this.decor = decor;
    }
}
