package cgt;

import cdp.Produtor;
import cdp.Propriedade;
import cgd.GDPropriedade;
import java.util.LinkedList;

public class GTPropriedade {
    
    private GDPropriedade gdPropriedade;

    public GTPropriedade() {
        gdPropriedade = new GDPropriedade();
    }
    
    public void cadastrarPropriedade(Produtor responsavel, String nome, String referencia){
        Propriedade propriedade = new Propriedade(nome, referencia, responsavel);
        gdPropriedade.cadastrar(propriedade);
    }
    
    public Propriedade instanciarPropriedadeVazia(Produtor responsavel){
        
        Propriedade propriedade = new Propriedade("", "", responsavel);
        
        return propriedade;
    }
    
    public void alterarPropriedade(Propriedade propriedade) {
        gdPropriedade.alterar(propriedade);
    }
      
    public void excluirPropriedade(Propriedade propriedade){
        gdPropriedade.excluir(propriedade);
        
    } 
    
    public LinkedList<Propriedade> consultarProdutor(String colunaFiltro, String valorFiltro) {
        return gdPropriedade.consultar(colunaFiltro, valorFiltro);
    }
}
