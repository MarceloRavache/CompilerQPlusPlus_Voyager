package ast;

import java.util.ArrayList;

public class Estru extends Statement{
    private final ArrayList<EstruturaAcesso> estruturas;

    public Estru(ArrayList<EstruturaAcesso> estruturas){
        this.estruturas = estruturas;
    }
    public Estru(){
        this.estruturas = new ArrayList<>();
    }
}
