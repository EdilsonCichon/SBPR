/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public int consultarPropriedade(){
        gdPropriedade.consultar();
        return 0;
    }
    
    public int excluirPropriedade(){
        gdPropriedade.excluir();
        return 0;
    } 
    
    public LinkedList<Propriedade> filtrarProdutores(String colunaFiltro, String valorFiltro) {
        return gdPropriedade.filtrar(colunaFiltro, valorFiltro);
    }
}
