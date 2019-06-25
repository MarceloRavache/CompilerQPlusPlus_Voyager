package ast;

import java.util.ArrayList;

public class Saida extends Comando{

    private final ArrayList<ParametroSaida> lista;
    public Saida(ArrayList<ParametroSaida> lista){
        this.lista = lista;
    }
}
