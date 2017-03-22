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
public class ServicoAgendado extends Servico{
    
    public ServicoAgendado(Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista) {
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista);
    } 
}
