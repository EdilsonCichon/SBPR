package cgd;

import cdp.Produtor;
import java.util.List;
import org.hibernate.Criteria;

public class GDProdutor extends GDGenerico{
       
    public List consultar(String colunaFiltro, String valorFiltro) {
        
        Criteria crit = criarSessao().createCriteria(Produtor.class);
//        crit.setMaxResults(50);
//        List<Produtor> listaProdutores = crit.list();
        
        return this.consultar(Produtor.class);
        
//        return listaProdutores;
    }
}