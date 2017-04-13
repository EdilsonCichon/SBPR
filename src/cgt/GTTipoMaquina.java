/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cgd.GDTipoMaquina;

public class GTTipoMaquina {
    
    private GDTipoMaquina gdTipoMaquina;

    public GTTipoMaquina() {
        gdTipoMaquina = new GDTipoMaquina();
    }
    
    public int cadastrarTipoMaquina(){
        gdTipoMaquina.cadastrar();
        return 0;
    }
    
    public int alterarTipoMaquina(){
        gdTipoMaquina.alterar();
        return 0;
    }
    
    public int consultarTipoMaquina(){
        gdTipoMaquina.consultar();
        return 0;
    }
    
    public int excluirTipoMaquina(){
        gdTipoMaquina.excluir();
        return 0;
    } 
}
