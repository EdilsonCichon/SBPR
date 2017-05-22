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
import javax.swing.JOptionPane;

public class CITipoServico {
    
    private CIInterface ciInterface;
    private GTTipoServico gtTipoServico;
    private JDCadastroTipoServico cadastroTipoServico;
    private JDPesquisaTipoServico pesquisaTipoServico;

    public CITipoServico(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtTipoServico = new GTTipoServico();
    }
    
    public void gerenciarTipoServico(int CENARIO, JFrame pai) {
        if (CENARIO == Cenario.CADASTRAR)
            instanciarTelaCadastroTipoServico(null, pai, CENARIO);
        else
            instanciarTelaFiltroProdutor(pai, CENARIO);
    }
    
    public void instanciarTelaCadastroTipoServico(TipoServico tipoServico, Frame pai, int CENARIO) {
        cadastroTipoServico = new JDCadastroTipoServico(pai, true, ciInterface, CENARIO, tipoServico);
        cadastroTipoServico.setVisible(true);
    }
     
    public void instanciarTelaFiltroProdutor(Frame pai, int CENARIO) {
        pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, ciInterface, CENARIO);
        pesquisaTipoServico.setVisible(true);
    }
    
    public boolean cadastrarTipoServico(String nome, String valor, String descricao, TipoMaquina tipoMaquina){ 
        try {
            gtTipoServico.cadastrarTipoServico(nome, valor, descricao, tipoMaquina);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean alterarTipoServico(TipoServico tipoServico){
        try {
            gtTipoServico.alterarTipoServico(tipoServico);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterado: " + e.getMessage());
            return false;
        }
    }
    
    public void consultarTipoServico(){
        int i = gtTipoServico.consultarTipoServico();
    }
    
    public boolean excluirTipoServico(TipoServico tipoServico) {
        try {
            gtTipoServico.excluirTipoServico(tipoServico);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            return true;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
            return false;
        } 
    } 
    
    public List<TipoServico> filtrarTipoServico(String colunaFiltro, String filtro) {
       return gtTipoServico.filtrarTipoServico(colunaFiltro, filtro);
    }
}
