package cgd;

import cdp.Servico;
import cdp.ServicoAgendado;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDServico extends GDGenerico {
         
    public List filtrar(String coluna, int id, Class classe) {
        Criteria crit = criarSessao().createCriteria(classe);
        crit.add(Restrictions.eq(coluna, id));
        List<ServicoAgendado> listaServico = (List<ServicoAgendado>) crit.list();
        sessao.close();
        return listaServico;
    }
    
    public List<ServicoAgendado> filtrarAgendados(int id) {
        
        Criteria crit = criarSessao().createCriteria(ServicoAgendado.class);
        crit.add(Restrictions.eq("propriedade_id", id));
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
