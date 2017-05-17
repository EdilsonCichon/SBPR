package cci;

import cci.util.Cenario;
import cdp.TipoMaquina;
import cgt.GTTipoMaquina;
import cih.tipoMaquina.JDCadastroTipoMaquina;
import cih.tipoMaquina.JDPesquisarTipoMaquina;
import java.awt.Frame;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CITipoMaquina {
    
    private final CIInterface ciInterface;
    private final GTTipoMaquina gtTipoMaquina;
    private JDCadastroTipoMaquina cadastroTipoMaquina;
    private JDPesquisarTipoMaquina pesquisaTipoMaquina;

    public CITipoMaquina(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtTipoMaquina = new GTTipoMaquina();
    }
    
    public void gerenciarTipoMaquina(int CENARIO, JFrame pai) {
        if ( CENARIO == Cenario.CADASTRAR ) {
            cadastroTipoMaquina = new JDCadastroTipoMaquina(pai, true, CENARIO, ciInterface, null);
            cadastroTipoMaquina.setVisible(true);
        } else {
            pesquisaTipoMaquina = new JDPesquisarTipoMaquina(pai, true, CENARIO, ciInterface);
            pesquisaTipoMaquina.setVisible(true);
        }
    }
        
    public boolean cadastrarTipoMaquina(String nome, String descricao) {
        try {
            gtTipoMaquina.cadastrarTipoMaquina(nome, descricao);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean alterarTipoMaquina(TipoMaquina tipoMaquina, String nome, String descricao) {
        try {
            gtTipoMaquina.alterarTipoMaquina(tipoMaquina, nome, descricao);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage());
            return false;
        }
    }
    
    public List<TipoMaquina> consultarTipoMaquina(){
       return gtTipoMaquina.consultarTipoMaquina();
    }
    
    public boolean excluirTipoMaquina(TipoMaquina tipoMaquina){
        try {
            gtTipoMaquina.excluirTipoMaquina(tipoMaquina);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
            return false;
        }  
    }
    
    public void instanciarTelaCadastroTipoMaquina(TipoMaquina tipoMaquina, Frame pai, int CENARIO) {
        cadastroTipoMaquina = new JDCadastroTipoMaquina(pai, true, CENARIO, ciInterface, tipoMaquina);
        cadastroTipoMaquina.setVisible(true);
    }
}
