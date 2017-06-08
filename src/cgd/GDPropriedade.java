package cgd;

import cdp.Propriedade;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDPropriedade extends GDGenerico{
     
    public List filtrar(String colunaFiltro, String valorFiltro) {
        Criteria crit = criarSessao().createCriteria(Propriedade.class);
        crit.add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") );
        List lista = crit.list();
        sessao.close();
        return lista;
    }
    
    public List filtrarPorProdutor(String colunaFiltro, int valorFiltro) {
        Criteria crit = criarSessao().createCriteria(Propriedade.class);
        crit.add( Restrictions.eq(colunaFiltro, valorFiltro) );
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
