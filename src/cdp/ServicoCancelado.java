package cdp;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "servico_cancelado")
@PrimaryKeyJoinColumn(name = "servico_cancelado_id")
public class ServicoCancelado extends Servico {
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date data_cancelamento;
    
    @Column(nullable = false, precision = 2)
    private double valor_multa;

    public ServicoCancelado() {
    }

    public ServicoCancelado(Date data_cancelamento, double valor_multa, int id, Date data_solicitacao, Date data_agendamento, 
            double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        
        super(id, data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
        this.data_cancelamento = data_cancelamento;
        this.valor_multa = valor_multa;
    }

    public ServicoCancelado(Date data_cancelamento, double valor_multa, Date data_solicitacao, Date data_agendamento, 
            double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
        this.data_cancelamento = data_cancelamento;
        this.valor_multa = valor_multa;
    }

    public Date getData_cancelamento() {
        return data_cancelamento;
    }

    public String getData_cancelamento(String formato) {
        SimpleDateFormat fmt = new SimpleDateFormat(formato);
        return fmt.format(getData_prevista_conclusao());
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
    
     public Object[] toArray() {
        return new Object[] { this, getData_prevista_conclusao(), getQtd_hrs_prevista(), "CANCELADO" };
    } 
}
