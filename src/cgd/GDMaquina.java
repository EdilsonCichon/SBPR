package cgd;

import cdp.Maquina;
import java.util.LinkedList;
import java.util.List;

public class GDMaquina extends GDGenerico{
    
    public List<Maquina> consultar() {
        
        Maquina maq1 = new Maquina("SD434", "GHB1254", null);
        Maquina maq2 = new Maquina("V355", "GBN2386", null);
        Maquina maq3 = new Maquina("BD233", "BNK7412", null);
        
        List<Maquina> listaMaquinas = new LinkedList();
        
        listaMaquinas.add(maq1);
        listaMaquinas.add(maq2);
        listaMaquinas.add(maq3);
        
        return listaMaquinas;
    }
}
