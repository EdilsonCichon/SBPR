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
public class ServicoConcluido extends Servico{
    
    private Date data_conclusao;
    private double valor_total;
    private double qtd_hrs_real;

    public ServicoConcluido(Date data_conclusao, double valor_total, double qtd_hrs_real, Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista) {
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista);
        this.data_conclusao = data_conclusao;
        this.valor_total = valor_total;
        this.qtd_hrs_real = qtd_hrs_real;
    } 
}
