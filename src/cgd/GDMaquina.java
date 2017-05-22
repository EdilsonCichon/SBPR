package cgd;

import cdp.Maquina;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDMaquina extends GDGenerico{
    
    public List filtrar(String colunaFiltro, String valorFiltro) {
        Criteria crit = criarSessao().createCriteria(Maquina.class);
        crit.add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") );
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
