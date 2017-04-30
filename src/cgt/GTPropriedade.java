/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Propriedade;
import cgd.GDPropriedade;

public class GTPropriedade {
    
    private GDPropriedade gdPropriedade;

    public GTPropriedade() {
        gdPropriedade = new GDPropriedade();
    }
    
    public void cadastrarPropriedade(String responsavel, String nome, String referencia){
        
        Propriedade propriedade = new Propriedade(nome, referencia);
        
        gdPropriedade.cadastrar(propriedade);
        
    }
    
    public int alterarPropriedade(){
        gdPropriedade.alterar();
        return 0;
    }
    
    public int consultarPropriedade(){
        gdPropriedade.consultar();
        return 0;
    }
    
    public int excluirPropriedade(){
        gdPropriedade.excluir();
        return 0;
    } 
}
