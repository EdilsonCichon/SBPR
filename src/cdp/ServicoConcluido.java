package cdp;

import java.util.Date;

public class ServicoConcluido extends Servico {
    
    private Date data_conclusao;
    private double valor_total;
    private double qtd_hrs_real;
    private Maquina maquina;

    public ServicoConcluido(Date data_conclusao, double valor_total, double qtd_hrs_real, Maquina maquina, Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
        this.data_conclusao = data_conclusao;
        this.valor_total = valor_total;
        this.qtd_hrs_real = qtd_hrs_real;
        this.maquina = maquina;
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
}
