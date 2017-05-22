package cgd;

import cdp.Funcionario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDFuncionario extends GDGenerico {

    public List filtrar(String colunaFiltro, String valorFiltro) {
        Criteria crit = criarSessao().createCriteria(Funcionario.class);
        crit.add(Restrictions.like(colunaFiltro, "%" + valorFiltro + "%"));
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
