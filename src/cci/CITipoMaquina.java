package cci;

import cci.util.Cenario;
import cdp.TipoMaquina;
import cgt.GTTipoMaquina;
import cih.tipoMaquina.JDCadastroTipoMaquina;
import cih.tipoMaquina.JDPesquisarTipoMaquina;
import java.awt.Frame;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CITipoMaquina {
    
    private CIInterface ciInterface;
    private GTTipoMaquina gtTipoMaquina;
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
        
    public TipoMaquina cadastrarTipoMaquina(String nome, String descricao) {
        try {
            TipoMaquina tipoMaquina = gtTipoMaquina.cadastrarTipoMaquina(nome, descricao);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            return tipoMaquina;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return null;
        }
    }
    
    public TipoMaquina alterarTipoMaquina(String nome, String descricao) {
        try {
            TipoMaquina tipoMaquina = gtTipoMaquina.alterarTipoMaquina(nome, descricao);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            return tipoMaquina;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage());
            return null;
        }
    }
    
    public LinkedList<TipoMaquina> consultarTipoMaquina(String nomePesquisado){
       return gtTipoMaquina.consultarTipoMaquina(nomePesquisado);
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
