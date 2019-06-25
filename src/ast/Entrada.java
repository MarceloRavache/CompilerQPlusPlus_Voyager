package ast;

import java.util.ArrayList;

public class Entrada extends Comando{
    private final ArrayList<ParametroEntrada> lista;
    public Entrada(ArrayList<ParametroEntrada> lista){
        this.lista = lista;
    }
}
