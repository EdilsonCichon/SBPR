package cgd;

import cdp.Produtor;
import cdp.Propriedade;
import java.util.Date;
import java.util.LinkedList;

public class GDPropriedade extends GDGenerico{
     
    public LinkedList<Propriedade> consultar(String colunaFiltro, String valorFiltro) {
        //ESSES DADOS DEVEM SER RETORNADOS DO BANCO.
        Produtor Edilson = new Produtor("12345", null, 0, "Edilson", new Date("10/10/1992"), "23053109873", "12345", 'M', "98423044");
        Produtor Erick = new Produtor("54312", null, 0, "Erick", new Date("10/10/1990"), "13043103871", "54312", 'M', "91421041");
        Produtor Crystian = new Produtor("54312", null, 0, "Crystian", new Date("10/10/1990"), "13043103871", "54312", 'M', "91421041");
        
        LinkedList<Propriedade> listaPropriedades = new LinkedList();
        listaPropriedades.add( new Propriedade(10, "Fazenda 1", "Perto da estrada", Edilson));
        listaPropriedades.add( new Propriedade(20, "Fazenda 2", "Longe da estrada", Erick));
        listaPropriedades.add( new Propriedade(30, "Fazenda 3", "Na da estrada", Crystian));
        return listaPropriedades;
    }
}
