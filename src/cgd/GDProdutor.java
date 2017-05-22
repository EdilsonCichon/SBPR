package cgd;

import cdp.Produtor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDProdutor extends GDGenerico {
       
    public List filtrar(String colunaFiltro, String valorFiltro) {
        Criteria crit = criarSessao().createCriteria(Produtor.class);
        crit.add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") );
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}