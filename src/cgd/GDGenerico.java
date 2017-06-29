package cgd;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

public abstract class GDGenerico {

    protected Session sessao;
    private final int CADASTRAR = 0;
    private final int ALTERAR = 1;
    private final int EXCLUIR = 3;
    
    public GDGenerico() {
        
    }
    
    private void persistir(Object obj, int cenario) throws SQLException {
        
        try {
            sessao = criarSessao();
            sessao.beginTransaction();
            switch (cenario) {
                case CADASTRAR: 
                    sessao.save(obj); break;
                case ALTERAR: 
                    sessao.update(obj); break;
                case EXCLUIR: 
                    sessao.delete(obj); break;
                default: break;    
            }
            sessao.getTransaction().commit();
            sessao.close();
        } catch (ConstraintViolationException ce) {
            sessao.getTransaction().rollback();
            sessao.close();
            throw new SQLException("Algum campo único já pertence a outro cadastro!");
        } catch (HibernateException he) {
            sessao.getTransaction().rollback();
            sessao.close();
            throw he;
        }
    }   
    
    public void cadastrar(Object obj) throws SQLException, ClassNotFoundException {
        persistir(obj, CADASTRAR);    
    }
    
    public void alterar(Object obj) throws SQLException, ClassNotFoundException {
        persistir(obj, ALTERAR);
    }
    
    public void excluir(Object obj) throws SQLException, ClassNotFoundException {
        persistir(obj, EXCLUIR);
    }
     
    public List consultar(Class classe) {
        
        List lista;
        sessao = criarSessao();
        sessao.beginTransaction();
        
        Criteria cons = sessao.createCriteria(classe);
        lista = cons.list();
        
        sessao.getTransaction().commit();
        sessao.close();
        
        return lista;
    }

    public Session criarSessao() {
        if ( sessao != null && sessao.isOpen())
            sessao.close();
        sessao = cgd.hibernate.HibernateConfig.getSessionFactory().openSession();
        return sessao;
    }
}
