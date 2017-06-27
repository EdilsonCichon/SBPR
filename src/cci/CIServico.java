package cci;

import cci.util.Cenario;
import cdp.Funcionario;
import cdp.Maquina;
import cdp.Produtor;
import cdp.Propriedade;
import cdp.Servico;
import cdp.ServicoAgendado;
import cdp.TipoServico;
import cgt.GTServico;
import cih.servico.JDCadastroServico;
import cih.servico.JDPesquisaServico;
import java.awt.Frame;
import java.util.List;
import javax.swing.JFrame;

public class CIServico {

    private CIInterface ciInterface;
    private GTServico gtServico;
    private JDCadastroServico agendarServico;
    private JDPesquisaServico pesquisaServico;

    public CIServico(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtServico = new GTServico();
    }

    public void gerenciarServico(int CENARIO, JFrame pai) {

        if (CENARIO == Cenario.AGENDAR) {
            instanciarTelaCadastroServico(null, pai, CENARIO);
        } else {
            instanciarTelaFiltroServico(pai, CENARIO);
        }
    }

    public void instanciarTelaCadastroServico(Servico servico, Frame pai, int CENARIO) {
        agendarServico = new JDCadastroServico(pai, true, ciInterface, CENARIO, servico);
        agendarServico.setVisible(true);
    }

    public void instanciarTelaFiltroServico(Frame pai, int CENARIO) {
        pesquisaServico = new JDPesquisaServico(pai, true, ciInterface, CENARIO);
        pesquisaServico.setVisible(true);
    }

    public void cadastrarServico(Produtor produtor, Propriedade propriedade,
            TipoServico tipoServico, String dtPrevistaConclusao, String qtdHrsPrevista){
        try {
            gtServico.cadastrarServico(produtor, propriedade, tipoServico, dtPrevistaConclusao, qtdHrsPrevista);
            ciInterface.getCiMensagem().exibirMensagemSucesso(agendarServico, "Serviço agendado com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(agendarServico, e.getMessage());
        }
    }

    public void alterarServico(Servico servico, Produtor produtor, Propriedade propriedade,
            TipoServico tipoServico, String dtPrevistaConclusao, String qtdHrsPrevista){
        try {
            gtServico.alterarServico(servico, produtor, propriedade, tipoServico, dtPrevistaConclusao, qtdHrsPrevista);
            ciInterface.getCiMensagem().exibirMensagemSucesso(agendarServico, "Serviço alterado com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(agendarServico, e.getMessage());
        }
    }

    public void cancelarServico(ServicoAgendado servico, String dataCancelamento, String valorMulta){
        try {
            gtServico.cancelarServico(servico, dataCancelamento, valorMulta);
            ciInterface.getCiMensagem().exibirMensagemSucesso(agendarServico, "Serviço cancelado com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(agendarServico, e.getMessage());
        }
    }

    public void concluirServico(ServicoAgendado servico, String dataConclusao, String qtdHoras, String total, Funcionario funcionarioSelecionado, Maquina maquinaSelecionada){
        try {
            gtServico.concluirServico(servico, dataConclusao, qtdHoras, total, funcionarioSelecionado, maquinaSelecionada);
            ciInterface.getCiMensagem().exibirMensagemSucesso(agendarServico, "Serviço concluído com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(agendarServico, e.getMessage());
        }
    }

    public List filtrarServico(String coluna, int id, Class classe) {
        return gtServico.filtrarServico(coluna, id, classe);
    }
}
