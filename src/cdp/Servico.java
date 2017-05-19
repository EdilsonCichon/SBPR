package cdp;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Servico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date data_prevista_conclusao;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date data_agendamento;
    
    @Column(nullable = false, precision = 2)
    private double qtd_hrs_prevista;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "produtor_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Produtor produtor;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "propriedade_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Propriedade propriedade;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_servico_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private TipoServico tipoServico;

    public Servico() {
    }

    public Servico(int id, Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        this.id = id;
        this.data_prevista_conclusao = data_solicitacao;
        this.data_agendamento = data_agendamento;
        this.qtd_hrs_prevista = qtd_hrs_prevista;
        this.produtor = produtor;
        this.propriedade = propriedade;
        this.tipoServico = tipoServico;
    }
   
    public Servico(Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        this.data_prevista_conclusao = data_solicitacao;
        this.data_agendamento = data_agendamento;
        this.qtd_hrs_prevista = qtd_hrs_prevista;
        this.produtor = produtor;
        this.propriedade = propriedade;
        this.tipoServico = tipoServico;
    }

    public Date getData_prevista_conclusao() {
        return data_prevista_conclusao;
    }

    public void setData_prevista_conclusao(Date data_prevista_conclusao) {
        this.data_prevista_conclusao = data_prevista_conclusao;
    }

    public Date getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(Date data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public double getQtd_hrs_prevista() {
        return qtd_hrs_prevista;
    }

    public void setQtd_hrs_prevista(double qtd_hrs_prevista) {
        this.qtd_hrs_prevista = qtd_hrs_prevista;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }    
}
