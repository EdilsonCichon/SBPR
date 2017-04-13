/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cgd.GDTipoServico;

public class GTTipoServico {
    
    private GDTipoServico gdTipoServico;

    public GTTipoServico() {
        gdTipoServico = new GDTipoServico();
    }
    
    public int cadastrarTipoServico(){
        gdTipoServico.cadastrar();
        return 0;
    }
    
    public int alterarTipoServico(){
        gdTipoServico.alterar();
        return 0;
    }
    
    public int consultarTipoServico(){
        gdTipoServico.consultar();
        return 0;
    }
    
    public int excluirTipoServico(){
        gdTipoServico.excluir();
        return 0;
    } 
}
