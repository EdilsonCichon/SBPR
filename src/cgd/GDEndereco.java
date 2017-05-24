package cgd;

import cdp.endereco.*;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDEndereco extends GDGenerico{
    
    public Cep consultarCep(String c){
        Criteria crit = criarSessao().createCriteria(Cep.class);
        crit.add(Restrictions.eq("nome", c));
        crit.setMaxResults(1);
        Cep cep = (Cep) crit.uniqueResult();
        sessao.close();
        return cep;
    }
    
    public Logradouro consultarLogradouro(String l){
        Criteria crit = criarSessao().createCriteria(Logradouro.class);
        crit.add(Restrictions.eq("nome", l));
        crit.setMaxResults(1);
        Logradouro logradouro = (Logradouro) crit.uniqueResult();
        sessao.close();
        return logradouro;
    }
    
    public Bairro consultarBairro(String b){
        Criteria crit = criarSessao().createCriteria(Bairro.class);
        crit.add(Restrictions.eq("nome", b));
        crit.setMaxResults(1);
        Bairro bairro = (Bairro) crit.uniqueResult();
        sessao.close();
        return bairro;
    }
    
    public Cidade consultarCidade(String c){
        Criteria crit = criarSessao().createCriteria(Cidade.class);
        crit.add(Restrictions.eq("nome", c));
        crit.setMaxResults(1);
        Cidade cidade = (Cidade) crit.uniqueResult();
        sessao.close();
        return cidade;
    }
    
    public Estado consultarEstado(String e){
        Criteria crit = criarSessao().createCriteria(Estado.class);
        crit.add(Restrictions.eq("nome", e));
        crit.setMaxResults(1);
        Estado estado = (Estado) crit.uniqueResult();
        sessao.close();
        return estado;
    }
    
    public Bairro consultarBairroCidade(String b, int idCidade){
        
        Criteria crit = criarSessao().createCriteria(Bairro.class);
        crit.add(Restrictions.eq("nome", b));
        crit.add(Restrictions.eq("cidade.id", idCidade));
        crit.setMaxResults(1);
        Bairro bairro = (Bairro) crit.uniqueResult();
        sessao.close();
        return bairro;
    }
    
    public Logradouro consultarLogradouroBairro(String l, int idBairro){
        Criteria crit = criarSessao().createCriteria(Logradouro.class);
        crit.add(Restrictions.eq("nome", l));
        crit.add(Restrictions.eq("bairro.id", idBairro));
        crit.setMaxResults(1);
        Logradouro logradouro = (Logradouro) crit.uniqueResult();
        sessao.close();
        return logradouro;
    }
}
