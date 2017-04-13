package cci;

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
    
    public void gerenciarTipoMaquina(int codCrud, JFrame pai) {
        JDCadastroTipoMaquina cadastroTipoMaquina;
        JDPesquisarTipoMaquina pesquisaTipoMaquina; 
        if (codCrud == 0) {
            cadastroTipoMaquina = new JDCadastroTipoMaquina(pai, true, ciInterface);
            cadastroTipoMaquina.setVisible(true);
        } else if (codCrud > 0) {
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
