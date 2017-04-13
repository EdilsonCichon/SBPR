package cdp;

import java.util.Date;

public class ServicoCancelado extends Servico {
    
    private Date data_cancelamento;
    private double valor_multa;

    public ServicoCancelado(Date data_cancelamento, double valor_multa, Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
        this.data_cancelamento = data_cancelamento;
        this.valor_multa = valor_multa;
    }

    public Date getData_cancelamento() {
        return data_cancelamento;
    }

    public void setData_cancelamento(Date data_cancelamento) {
        this.data_cancelamento = data_cancelamento;
    }

    public double getValor_multa() {
        return valor_multa;
    }

    public void setValor_multa(double valor_multa) {
        this.valor_multa = valor_multa;
    }
}
