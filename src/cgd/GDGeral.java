package cgd;

import cdp.endereco.Cep;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDGeral extends GDGenerico{

    public Cep consultarCep(String c){
        Criteria crit = criarSessao().createCriteria(Cep.class);
        crit.add(Restrictions.gt("nome", c));
        crit.setMaxResults(1);
        Cep cep = (Cep) crit.uniqueResult();
        sessao.close();
        return cep;
    }
}
