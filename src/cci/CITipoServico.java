package cci;

import cci.util.Cenario;
import cdp.TipoServico;
import cgt.GTTipoServico;
import javax.swing.JFrame;
import cih.tipoServico.JDCadastroTipoServico;
import cih.tipoServico.JDPesquisaTipoServico;
import java.awt.Frame;
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
     
    public void instanciarTelaFiltroProdutor(Frame pai, int CENARIO){
        pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, ciInterface);
        pesquisaTipoServico.setVisible(true);
    }
    
    public boolean cadastrarTipoServico(String nome, String valor, String descricao){ 
        try {
            gtTipoServico.cadastrarTipoServico(nome, valor, descricao);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public void alterarTipoServico(){
        int i = gtTipoServico.alterarTipoServico();
    }
    
    public void consultarTipoServico(){
        int i = gtTipoServico.consultarTipoServico();
    }
    
    public void excluirTipoServico(){
        int i = gtTipoServico.excluirTipoServico();
    } 
    
}
