package ast;

import java.util.ArrayList;

public class PublicEstr extends EstruturaAcesso{
    private final ArrayList<Membro> membros;

    public PublicEstr(ArrayList<Membro> membros){
        this.membros = membros;
    }
    public PublicEstr(){
        this.membros = new ArrayList<>();
    }
}
