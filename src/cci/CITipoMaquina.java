package cci;

import cci.util.Cenario;
import javax.swing.JFrame;
import cgt.GTTipoMaquina;
import cih.tipoMaquina.JDCadastroTipoMaquina;
import cih.tipoMaquina.JDPesquisarTipoMaquina;
import javax.swing.JOptionPane;

public class CITipoMaquina {
    
    private CIInterface ciInterface;
    private GTTipoMaquina gtTipoMaquina;

    public CITipoMaquina(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtTipoMaquina = new GTTipoMaquina();
    }
    
    public void gerenciarTipoMaquina(int CENARIO, JFrame pai) {
        JDCadastroTipoMaquina cadastroTipoMaquina;
        JDPesquisarTipoMaquina pesquisaTipoMaquina; 
        if (CENARIO == Cenario.CADASTRAR) {
            cadastroTipoMaquina = new JDCadastroTipoMaquina(pai, true, ciInterface);
            cadastroTipoMaquina.setVisible(true);
        } else if (CENARIO > Cenario.ALTERAR) {
            pesquisaTipoMaquina = new JDPesquisarTipoMaquina(pai, true, ciInterface);
            pesquisaTipoMaquina.setVisible(true);
        }else if (CENARIO > Cenario.CONSULTAR) {
            pesquisaTipoMaquina = new JDPesquisarTipoMaquina(pai, true, ciInterface);
            pesquisaTipoMaquina.setVisible(true);
        }else if (CENARIO > Cenario.EXCLUIR) {
            pesquisaTipoMaquina = new JDPesquisarTipoMaquina(pai, true, ciInterface);
            pesquisaTipoMaquina.setVisible(true);
        }
    }
        
    public void cadastrarTipoMaquina(String nome, String descricao) {
        try {
            gtTipoMaquina.cadastrarTipoMaquina(nome, descricao);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        }
    }
    
    public void alterarTipoMaquina(){
        int i = gtTipoMaquina.alterarTipoMaquina();
    }
    
    public void consultarTipoMaquina(){
        int i = gtTipoMaquina.consultarTipoMaquina();
    }
    
    public void excluirTipoMaquina(){
        int i = gtTipoMaquina.excluirTipoMaquina();
    }
}
