package cgd;

import cdp.Funcionario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDFuncionario extends GDGenerico {

    public List filtrar(String colunaFiltro, String valorFiltro) {
        
        colunaFiltro = colunaFiltro.toLowerCase();
        List lista = null;
        
        if(colunaFiltro.equals("cargo")){
            // DESENVOLVER LOGICA PARA PESQUISA NA TABELA DE CARGOS
        }else{
            
        Criteria crit = criarSessao().createCriteria(Funcionario.class);
        crit.add(Restrictions.like(colunaFiltro.toLowerCase(), "%" + valorFiltro + "%"));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        lista = crit.list();
        sessao.close();
        }
         return lista;
    }
}
