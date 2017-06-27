package cci;

import cci.util.Cenario;
import cdp.TipoMaquina;
import cdp.TipoServico;
import cgt.GTTipoServico;
import javax.swing.JFrame;
import cih.tipoServico.JDCadastroTipoServico;
import cih.tipoServico.JDPesquisaTipoServico;
import java.awt.Frame;
import java.util.List;

public class CITipoServico {
    
    private CIInterface ciInterface;
    private GTTipoServico gtTipoServico;
    private JDCadastroTipoServico cadastroTipoServico;
    private JDPesquisaTipoServico pesquisaTipoServico;
    private TipoServico tipoServicoSelecionado;

    public CITipoServico(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtTipoServico = new GTTipoServico();
    }
    
    public void gerenciarTipoServico(int CENARIO, JFrame pai) {
        if (CENARIO == Cenario.CADASTRAR)
            instanciarTelaCadastroTipoServico(null, pai, CENARIO);
        else
            instanciarTelaFiltroTipoServico(pai, CENARIO);
    }
    
    public void instanciarTelaCadastroTipoServico(TipoServico tipoServico, Frame pai, int CENARIO) {
        cadastroTipoServico = new JDCadastroTipoServico(pai, true, ciInterface, CENARIO, tipoServico);
        cadastroTipoServico.setVisible(true);
    }
     
    public void instanciarTelaFiltroTipoServico(Frame pai, int CENARIO) {
        pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, ciInterface, CENARIO);
        pesquisaTipoServico.setVisible(true);
    }
    
    public void cadastrarTipoServico(String nome, String valor, String descricao, TipoMaquina tipoMaquina){ 
        try {
            gtTipoServico.cadastrarTipoServico(nome, valor, descricao, tipoMaquina);
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroTipoServico, "Cadastrado com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroTipoServico, e.getMessage());
        }
    }
    
    public void alterarTipoServico(TipoServico tipoServico, TipoMaquina tipoMaquina, String nome, String valor, String descricao){
        try {
            gtTipoServico.alterarTipoServico(tipoServico, tipoMaquina, nome, valor, descricao);
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroTipoServico, "Alterado com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroTipoServico, e.getMessage());
        }
    }
    
    public List<TipoServico> consultarTipoServico(){
        return gtTipoServico.consultarTipoServico();
    }
    
    public void excluirTipoServico(TipoServico tipoServico){
        try {
            gtTipoServico.excluirTipoServico(tipoServico);
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroTipoServico, "Excluído com sucesso!");
        } catch(Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroTipoServico, e.getMessage());
        } 
    } 
    
    public List<TipoServico> filtrarTipoServico(String colunaFiltro, String filtro) {
       return gtTipoServico.filtrarTipoServico(colunaFiltro, filtro);
    }

    public TipoServico getTipoServicoSelecionado() {
        return tipoServicoSelecionado;
    }

    public void setTipoServicoSelecionado(TipoServico tipoServicoSelecionado) {
        this.tipoServicoSelecionado = tipoServicoSelecionado;
    }
}
