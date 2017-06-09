package cgd;

import cdp.Propriedade;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDPropriedade extends GDGenerico{
     
    public List filtrar(String colunaFiltro, String valorFiltro) {
        
        colunaFiltro = colunaFiltro.replace("id produtor", "responsavel.id");
        Criteria crit = criarSessao().createCriteria(Propriedade.class);
        
        if ( colunaFiltro.equals("responsavel.id") )
            crit.add( Restrictions.eq(colunaFiltro, Integer.parseInt(valorFiltro)) );
        else
            crit.add( Restrictions.like(colunaFiltro, "%"+valorFiltro+"%") );
        
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
