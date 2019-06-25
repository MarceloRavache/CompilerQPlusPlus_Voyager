package ast;

public class Func extends Statement{
    private final FuncaoCabecalho func;
    private final Bloco bloco;
    public Func(FuncaoCabecalho func, Bloco bloco){
        this.bloco = bloco;
        this.func = func;
    }
}
