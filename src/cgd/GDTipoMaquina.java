package cgd;

import cdp.TipoMaquina;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDTipoMaquina extends GDGenerico{
    
    public List filtrar(String colunaFiltro, String valorFiltro) {
        Criteria crit = criarSessao().createCriteria(TipoMaquina.class);
        crit.add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") );
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
