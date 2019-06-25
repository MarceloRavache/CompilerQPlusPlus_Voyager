package ast;

public class ObjectExpr extends Tipo{
    private final Qualificador quali;
    private final Decorador decor;
    private final TipoNome nomeTipo;
    public ObjectExpr(Qualificador quali,Decorador decor,TipoNome nomeTipo){
        this.quali = quali;
        this.decor = decor;
        this.nomeTipo = nomeTipo;
    }
}
