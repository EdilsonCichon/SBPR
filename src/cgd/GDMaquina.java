package cgd;

import cdp.Maquina;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDMaquina extends GDGenerico{
    
    public List filtrar(String colunaFiltro, Object valorFiltro) {
        
        Criteria crit = criarSessao().createCriteria(Maquina.class);
        //colunaFiltro = colunaFiltro.toLowerCase();
        if (valorFiltro instanceof String)
            crit.add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") );
        else if (valorFiltro instanceof Integer)
            crit.add( Restrictions.eq(colunaFiltro, valorFiltro) );
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
