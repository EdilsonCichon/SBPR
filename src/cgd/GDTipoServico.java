
package cgd;

import cdp.TipoServico;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDTipoServico extends GDGenerico {
    
    public List filtrar(String colunaFiltro, String valorFiltro) {
        colunaFiltro = colunaFiltro.replace("valor hora", "valor_hr");
        
        Criteria crit = criarSessao().createCriteria(TipoServico.class);
        if ( colunaFiltro.equals("valor_hr") )
            crit.add( Restrictions.gt(colunaFiltro, Double.parseDouble(valorFiltro)) );
        else
            crit.add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") );
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
