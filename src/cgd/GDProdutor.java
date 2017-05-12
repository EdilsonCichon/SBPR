package cgd;

import cdp.Produtor;
import cdp.Propriedade;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class GDProdutor extends GDGenerico{
       
    public LinkedList<Produtor> consultar(String colunaFiltro, String valorFiltro) {
        
        //ESSES DADOS DEVEM SER RETORNADOS DO BANCO
        Produtor edilson = new Produtor("12345", null, 0, "Edilson", new Date("10/10/1992"), "23053109873", "12345", 'M', "98423044");
        Produtor erick = new Produtor("54312", null, 0, "Erick", new Date("10/10/1990"), "13043103871", "54312", 'M', "91421041");
        Produtor cristian = new Produtor("54312", null, 0, "Crystian", new Date("10/10/1990"), "13043103871", "54312", 'M', "91421041");
        
        Collection<Propriedade> propriedadesEdilson = new LinkedList();
        propriedadesEdilson.add( new Propriedade(10, "Fazenda 1", "Perto da estrada", edilson));
        propriedadesEdilson.add( new Propriedade(20, "Fazenda 2", "Longe da estrada", edilson));
        propriedadesEdilson.add( new Propriedade(30, "Fazenda 3", "Na da estrada", edilson));
        
        Collection<Propriedade> propriedadesErick = new LinkedList();
        propriedadesErick.add( new Propriedade(10, "Fazenda 4", "Colatina", erick));
        propriedadesErick.add( new Propriedade(20, "Fazenda 5", "Marilandia", erick));
        propriedadesErick.add( new Propriedade(30, "Fazenda 6", "Sao Roque", erick));
        
        Collection<Propriedade> propriedadesCristian = new LinkedList();
        propriedadesCristian.add( new Propriedade(10, "Fazenda 7", "Vicosa", cristian));
        propriedadesCristian.add( new Propriedade(20, "Fazenda 8", "Boa esperança", cristian));
        propriedadesCristian.add( new Propriedade(30, "Fazenda 9", "Pinheiros", cristian));
        
        edilson.setPropriedades(propriedadesEdilson);
        erick.setPropriedades(propriedadesErick);
        cristian.setPropriedades(propriedadesCristian);
        
        LinkedList<Produtor> listaProdutores = new LinkedList();
        listaProdutores.add( edilson );
        listaProdutores.add( erick );
        listaProdutores.add( cristian );
        
        return listaProdutores;
    }
}