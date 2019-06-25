package ast;

public class CharExpr extends Tipo{
    private final Qualificador quali;
    private final Decorador decor;
    public CharExpr(Qualificador quali,Decorador decor){
        this.quali = quali;
        this.decor = decor;
    }
}
