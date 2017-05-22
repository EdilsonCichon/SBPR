package cgt;

import cdp.Produtor;
import cdp.Propriedade;
import cgd.GDPropriedade;
import java.sql.SQLException;
import java.util.List;

public class GTPropriedade {
    
    private GDPropriedade gdPropriedade;

    public GTPropriedade() {
        gdPropriedade = new GDPropriedade();
    }
    
    public void cadastrarPropriedade(Produtor responsavel, String nome, String referencia) throws SQLException, ClassNotFoundException{
        Propriedade propriedade = new Propriedade(nome, referencia, responsavel);
        gdPropriedade.cadastrar(propriedade);
    }
    
    public Propriedade instanciarPropriedadeVazia(Produtor responsavel){
        
        Propriedade propriedade = new Propriedade("", "", responsavel);
        
        return propriedade;
    }
    
    public void alterarPropriedade(Propriedade propriedade) throws SQLException, ClassNotFoundException {
        gdPropriedade.alterar(propriedade);
    }
      
    public void excluirPropriedade(Propriedade propriedade) throws SQLException, ClassNotFoundException{
        gdPropriedade.excluir(propriedade);
        
    } 
    
    public List<Propriedade> filtrarPropriedade(String colunaFiltro, String valorFiltro) {
        return gdPropriedade.filtrar(colunaFiltro, valorFiltro);
    }
}
