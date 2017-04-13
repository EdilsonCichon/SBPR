/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cgd.GDProdutor;

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
    
    public int consultarProdutor(){
        gdProdutor.consultar();
        return 0;
    }
    
    public int excluirProdutor(){
        gdProdutor.excluir();
        return 0;
    } 
}
