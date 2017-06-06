package cgd;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDServico extends GDGenerico {
         
    public List filtrar(String coluna, int id, Class classe) {
        Criteria crit = criarSessao().createCriteria(classe);
        crit.add(Restrictions.eq(coluna, id));
        List listaServico =  crit.list();
        sessao.close();
        return listaServico;
    }
}
