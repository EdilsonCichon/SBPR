/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Chrysthian
 */
public abstract class Servico {
    
    private Date data_solicitacao;
    private Date data_agendamento;
    private double qtd_hrs_prevista;

    public Servico(Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista) {
        this.data_solicitacao = data_solicitacao;
        this.data_agendamento = data_agendamento;
        this.qtd_hrs_prevista = qtd_hrs_prevista;
    } 
}
