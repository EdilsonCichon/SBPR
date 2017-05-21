package cdp;

import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "servico_concluido")
@PrimaryKeyJoinColumn(name = "servico_concluido_id")
public class ServicoConcluido extends Servico {
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date data_conclusao;
    
    @Column(nullable = false, precision = 2)
    private double valor_total;
    
    @Column(nullable = false, precision = 2)
    private double qtd_hrs_real;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maquina_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Maquina maquina;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "funcionario_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Funcionario funcionario;
    
    public ServicoConcluido() {
    }

    public ServicoConcluido(Date data_conclusao, double valor_total, double qtd_hrs_real, Maquina maquina, Funcionario funcionario, 
            int id, Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        
        super(id, data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
        this.data_conclusao = data_conclusao;
        this.valor_total = valor_total;
        this.qtd_hrs_real = qtd_hrs_real;
        this.maquina = maquina;
        this.funcionario = funcionario;
    }

    public ServicoConcluido(Date data_conclusao, double valor_total, double qtd_hrs_real, Maquina maquina, Funcionario funcionario, 
            Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
        this.data_conclusao = data_conclusao;
        this.valor_total = valor_total;
        this.qtd_hrs_real = qtd_hrs_real;
        this.maquina = maquina;
        this.funcionario = funcionario;
    }

    public Date getData_conclusao() {
        return data_conclusao;
    }

    public void setData_conclusao(Date data_conclusao) {
        this.data_conclusao = data_conclusao;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getQtd_hrs_real() {
        return qtd_hrs_real;
    }

    public void setQtd_hrs_real(double qtd_hrs_real) {
        this.qtd_hrs_real = qtd_hrs_real;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
