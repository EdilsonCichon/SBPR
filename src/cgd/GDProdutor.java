
package cgd;

import cdp.Produtor;
import cdp.Propriedade;
import java.util.Date;
import java.util.LinkedList;

public class GDProdutor {

    public GDProdutor(){
  
    }
    
    public void cadastrar(Produtor produtor){
          
    }
    
    public void alterar(Produtor produtor){
       
    }
    
    public void consultar() {
       
    }
    
    public LinkedList<Produtor> filtrar(String colunaFiltro, String valorFiltro) {
        //ESSES DADOS DEVEM SER RETORNADOS DO BANCO.
        LinkedList listaPropriedades = new LinkedList();
        listaPropriedades.add( new Propriedade(10, "Fazenda 1", "Perto da estrada"));
        listaPropriedades.add( new Propriedade(20, "Fazenda 2", "Longe da estrada"));
        listaPropriedades.add( new Propriedade(30, "Fazenda 3", "Na da estrada"));
        
        LinkedList listaProdutores = new LinkedList();
        listaProdutores.add( new Produtor("12345", listaPropriedades, 0, "Edilson", new Date("10/10/1992"), "23053109873", "12345", 'M', "98423044") );
        listaProdutores.add( new Produtor("54312", listaPropriedades, 0, "Erick", new Date("10/10/1990"), "13043103871", "54312", 'M', "91421041") );
        listaProdutores.add( new Produtor("54312", listaPropriedades, 0, "Crystian", new Date("10/10/1990"), "13043103871", "54312", 'M', "91421041") );
        return listaProdutores;
    }
    
    public void excluir(Produtor produtor){
       
    } 
}
