package cgt;

import cdp.Funcionario;
import cdp.Maquina;
import cdp.Produtor;
import cdp.Propriedade;
import cdp.Servico;
import cdp.ServicoAgendado;
import cdp.ServicoCancelado;
import cdp.ServicoConcluido;
import cdp.TipoServico;
import cgd.GDServico;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GTServico {
    
    private GDServico gdServico;

    public GTServico() {
        gdServico = new GDServico();
    }
    
    public void cadastrarServico(Produtor produtor, Propriedade propriedade, 
            TipoServico tipoServico, String dtPrevistaConclusao,
            String qtdHrsPrevista) throws Exception {
        
        ServicoAgendado servicoAgendado = new ServicoAgendado();
        servicoAgendado.setProdutor(produtor);
        servicoAgendado.setPropriedade(propriedade);
        servicoAgendado.setTipoServico(tipoServico);
        servicoAgendado.setData_agendamento(Calendar.getInstance().getTime());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dtPrevistaConclusao);
        
        servicoAgendado.setData_prevista_conclusao(data);
        servicoAgendado.setQtd_hrs_prevista(Double.parseDouble(qtdHrsPrevista));
        gdServico.cadastrar(servicoAgendado);
    }
    
    public void alterarServico(Servico servico, Produtor produtor, Propriedade propriedade, 
                TipoServico tipoServico, String dtPrevistaConclusao, 
                String qtdHrsPrevista) throws SQLException, ClassNotFoundException, ParseException{
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dtPrevistaConclusao);
        
        servico.setData_prevista_conclusao(data);
        servico.setQtd_hrs_prevista(Double.parseDouble(qtdHrsPrevista));
        servico.setProdutor(produtor);
        servico.setPropriedade(propriedade);
        servico.setTipoServico(tipoServico);
        
        gdServico.alterar(servico);
    }

    public void cancelarServico(ServicoAgendado servicoAgendado, String dataCancelamento, String valorMulta) throws SQLException, ClassNotFoundException, ParseException{
        
        ServicoCancelado servicoCancelado = new ServicoCancelado();
        
        servicoCancelado.setId(servicoAgendado.getId());
        servicoCancelado.setProdutor(servicoAgendado.getProdutor());
        servicoCancelado.setPropriedade(servicoAgendado.getPropriedade());
        servicoCancelado.setData_agendamento(servicoAgendado.getData_agendamento());
        servicoCancelado.setData_prevista_conclusao(servicoAgendado.getData_prevista_conclusao());
        servicoCancelado.setQtd_hrs_prevista(servicoAgendado.getQtd_hrs_prevista());
        servicoCancelado.setTipoServico(servicoAgendado.getTipoServico());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataCancelamento);
        
        servicoCancelado.setData_cancelamento(data);
        servicoCancelado.setValor_multa(Double.parseDouble(valorMulta));
        
        gdServico.cancelarServico(servicoAgendado, servicoCancelado);   
    } 
    
    public void concluirServico(ServicoAgendado servico, String dataConclusao, String qtdHoras, String total, Funcionario funcionarioSelecionado, Maquina maquinaSelecionada) throws SQLException, ClassNotFoundException, ParseException{
        
        ServicoConcluido servicoConcluido = new ServicoConcluido();
        
        servicoConcluido.setId(servico.getId());
        servicoConcluido.setProdutor(servico.getProdutor());
        servicoConcluido.setPropriedade(servico.getPropriedade());
        servicoConcluido.setData_agendamento(servico.getData_agendamento());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataConclusao);
        
        servicoConcluido.setData_conclusao(data);
        servicoConcluido.setData_prevista_conclusao(servico.getData_prevista_conclusao());
        servicoConcluido.setFuncionario(funcionarioSelecionado);
        servicoConcluido.setMaquina(maquinaSelecionada);
        servicoConcluido.setQtd_hrs_prevista(servico.getQtd_hrs_prevista());
        servicoConcluido.setTipoServico(servico.getTipoServico());
        servicoConcluido.setValor_total(Double.parseDouble(total));
        
        gdServico.concluirServico(servico, servicoConcluido);
    } 
    
    public List filtrarServico(String coluna, int id, Class classe) {
        return gdServico.filtrar(coluna, id, classe);
    }    
}
