package ast;

public class AcessoFunc extends NomeLista{
    private final NomeLista nome;
    private final ParametrosReais param;
    public AcessoFunc(NomeLista nome,ParametrosReais param){
        this.param = param;
        this.nome = nome;
    }
}
