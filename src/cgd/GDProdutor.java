
package cgd;

import cdp.Produtor;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GDProdutor {

    public GDProdutor(){
  
    }
    
    public void cadastrar(){
          
    }
    
    public void alterar(){
       
    }
    
    public LinkedList<Produtor> consultar(String colunaFiltro, String valorFiltro) {
        //ESSES DADOS DEVEM SER RETORNADOS DO BANCO.
        LinkedList lista = new LinkedList();
        lista.add( new Produtor("12345", null, 0, "Edilson", new Date("10/10/1992"), "23053109873", "12345", 'M', "98423044") );
        lista.add( new Produtor("54312", null, 0, "Erick", new Date("10/10/1990"), "13043103871", "54312", 'M', "91421041") );
        lista.add( new Produtor("54312", null, 0, "Crystian", new Date("10/10/1990"), "13043103871", "54312", 'M', "91421041") );
        return lista;
    }
    
    public void excluir(){
       
    } 
}
