package cdp;

import java.util.Date;

public abstract class Servico {
    
    private Date data_solicitacao;
    private Date data_agendamento;
    private double qtd_hrs_prevista;
    private Produtor produtor;
    private Propriedade propriedade;
    private TipoServico tipoServico;

    public Servico(Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        this.data_solicitacao = data_solicitacao;
        this.data_agendamento = data_agendamento;
        this.qtd_hrs_prevista = qtd_hrs_prevista;
        this.produtor = produtor;
        this.propriedade = propriedade;
        this.tipoServico = tipoServico;
    }

    public Date getData_solicitacao() {
        return data_solicitacao;
    }

    public void setData_solicitacao(Date data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
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
