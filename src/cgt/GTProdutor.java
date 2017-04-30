/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Produtor;
import cgd.GDProdutor;
import java.util.LinkedList;

public class GTProdutor {
    
    private GDProdutor gdProdutor;

    public GTProdutor() {
        gdProdutor = new GDProdutor();
    }
    
    public int cadastrarProdutor(){
        gdProdutor.cadastrar();
        return 0;
    }
    
    public int alterarProdutor(){
        gdProdutor.alterar();
        return 0;
    }
    
    public LinkedList<Produtor> consultarProdutor(String colunaFiltro, String valorFiltro) {
        return gdProdutor.consultar(colunaFiltro, valorFiltro);
    }
    
    public int excluirProdutor(){
        gdProdutor.excluir();
        return 0;
    } 
}
