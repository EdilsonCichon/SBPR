package cgd;

import cdp.Funcionario;
import cdp.Usuario;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDGeral extends GDGenerico{

    public Usuario validarAcesso(String login, String senha){
        Criteria crit = criarSessao().createCriteria(Usuario.class);
        crit.add(Restrictions.eq("login", login));
        crit.add(Restrictions.eq("senha", senha));
        crit.setMaxResults(1);
        Usuario usuario = (Usuario) crit.uniqueResult();
        sessao.close();
        return usuario;   
    }
    
    public Funcionario identificarFuncionario(int id){
        Criteria crit = criarSessao().createCriteria(Funcionario.class);
        crit.add(Restrictions.eq("usuario.id", id));
        crit.setMaxResults(1);
        Funcionario funcionario = (Funcionario) crit.uniqueResult();
        sessao.close();
        return funcionario;   
    }
}
