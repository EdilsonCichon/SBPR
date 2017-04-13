/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cgd.GDServico;

/**
 *
 * @author Chrysthian
 */
public class GTServico {
    
    private GDServico gdServico;

    public GTServico() {
        gdServico = new GDServico();
    }
    
    public int cadastrarServico(){
        gdServico.cadastrar();
        return 0;
    }
    
    public int alterarServico(){
        gdServico.alterar();
        return 0;
    }
    
    public int consultarServico(){
        gdServico.consultar();
        return 0;
    }
    
    public int cancelarServico(){
        gdServico.cancelar();
        return 0;
    } 
    
    public int concluirServico(){
        gdServico.concluir();
        return 0;
    } 
}
