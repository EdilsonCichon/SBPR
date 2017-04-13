package cdp;

import java.util.Date;

public class ServicoAgendado extends Servico {

    public ServicoAgendado(Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
    }
}
