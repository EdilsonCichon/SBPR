/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.Date;

/**
 *
 * @author Chrysthian
 */
public class ServicoCancelado extends Servico{
    
    private Date data_cancelamento;
    private double valor_multa;

    public ServicoCancelado(Date data_cancelamento, double valor_multa, Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista) {
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista);
        this.data_cancelamento = data_cancelamento;
        this.valor_multa = valor_multa;
    }
}
