/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cgd.GDMaquina;

public class GTMaquina {
    
    private GDMaquina gdMaquina;

    public GTMaquina() {
        gdMaquina = new GDMaquina();
    }
    
    public int cadastrarMaquina(){
        gdMaquina.cadastrar();
        return 0;
    }
    
    public int alterarMaquina(){
        gdMaquina.alterar();
        return 0;
    }
    
    public int consultarMaquina(){
        gdMaquina.consultar();
        return 0;
    }
    
    public int excluirMaquina(){
        gdMaquina.excluir();
        return 0;
    } 
}
