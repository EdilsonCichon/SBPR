package cdp;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "servico_agendado")
@PrimaryKeyJoinColumn(name = "servico_agendado_id")

public class ServicoAgendado extends Servico {

    public ServicoAgendado() {
    }

    public ServicoAgendado(int id, Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, 
            Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        
        super(id, data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
    }

    public ServicoAgendado(Date data_solicitacao, Date data_agendamento, double qtd_hrs_prevista, 
            Produtor produtor, Propriedade propriedade, TipoServico tipoServico) {
        
        super(data_solicitacao, data_agendamento, qtd_hrs_prevista, produtor, propriedade, tipoServico);
    }
}
