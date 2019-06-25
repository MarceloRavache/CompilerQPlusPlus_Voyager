package ast;

import java.util.ArrayList;

public class ProtectedEstr extends EstruturaAcesso{
    private final ArrayList<Membro> membros;

    public ProtectedEstr(ArrayList<Membro> membros){
        this.membros = membros;
    }
    public ProtectedEstr(){
        this.membros = new ArrayList<>();
    }
}
