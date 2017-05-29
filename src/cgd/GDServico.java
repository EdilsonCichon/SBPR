package cgd;

import cdp.Servico;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDServico extends GDGenerico {
      
    public void cancelar(){
        
    }
    
    public void consultar(){
        
    }
    
    public void concluir(){
        
    }
    
    public List filtrar(int produtor_id, int propriedade_id, int tipoServico_id) {
        Criteria crit = criarSessao().createCriteria(Servico.class);
        crit.add(Restrictions.eq("produtor_id", produtor_id));
        crit.add(Restrictions.eq("propriedade_id", propriedade_id));
        crit.add(Restrictions.eq("tipo_servico_id", tipoServico_id));
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
