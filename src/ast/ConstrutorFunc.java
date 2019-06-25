package ast;

import java.util.ArrayList;

public class ConstrutorFunc extends Membro{
    private final ParametrosFormais parametroFormal;
    private final Bloco bloco;

    public ConstrutorFunc(ParametrosFormais parametroFormal, Bloco bloco){
        this.parametroFormal = parametroFormal;
        this.bloco = bloco;
    }
    public ConstrutorFunc(){
        this.parametroFormal = new ParametrosFormais();
        this.bloco = new Bloco();
    }
}
