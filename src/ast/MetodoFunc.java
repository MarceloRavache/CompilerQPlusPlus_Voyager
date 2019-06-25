package ast;

public class MetodoFunc extends Membro{
    private final FuncaoCabecalho func;
    private final Qualificador quali;
    private final Bloco bloco;
    public MetodoFunc(FuncaoCabecalho func,Qualificador quali, Bloco bloco){
        this.bloco = bloco;
        this.func = func;
        this.quali = quali;
    }
}
