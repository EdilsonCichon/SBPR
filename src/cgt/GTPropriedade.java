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
    
    public void alterarPropriedade(Propriedade propriedade) {
        gdPropriedade.alterar(propriedade);
    }
    
    public void consultarPropriedade(){
        gdPropriedade.consultar();
    }
    
    public void excluirPropriedade(){
        gdPropriedade.excluir();
        
    } 
    
    public LinkedList<Propriedade> filtrarProdutores(String colunaFiltro, String valorFiltro) {
        return gdPropriedade.filtrar(colunaFiltro, valorFiltro);
    }
}
