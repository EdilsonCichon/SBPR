package cci;

import cci.util.Cenario;
import cgt.GTTipoServico;
import javax.swing.JFrame;
import cih.tipoServico.JDCadastroTipoServico;
import cih.tipoServico.JDPesquisaTipoServico;
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
        
        if (CENARIO == Cenario.CADASTRAR) {
            cadastroTipoServico = new JDCadastroTipoServico(pai, true, ciInterface, CENARIO, null);
            cadastroTipoServico.setVisible(true);
        } else {
            pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, ciInterface);
            pesquisaTipoServico.setVisible(true);
        }
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
