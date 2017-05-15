package cci;

import cci.util.Cenario;
import cdp.Maquina;
import cgt.GTMaquina;
import javax.swing.JFrame;
import cih.maquina.JDCadastroMaquina;
import cih.maquina.JDPesquisarMaquina;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class CIMaquina {
    
    private CIInterface ciInterface;
    private GTMaquina gtMaquina;
    private JDCadastroMaquina cadastroMaquina;
    private JDPesquisarMaquina pesquisaMaquina; 

    public CIMaquina(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtMaquina = new GTMaquina();
    }
    
    public void gerenciarMaquina(int CENARIO, JFrame pai) {
        
        if (CENARIO == Cenario.CADASTRAR) {
            cadastroMaquina = new JDCadastroMaquina(pai, true, ciInterface, Cenario.CADASTRAR, null);
            cadastroMaquina.setVisible(true);
        } else {
            pesquisaMaquina = new JDPesquisarMaquina(pai, true, ciInterface);
            pesquisaMaquina.setVisible(true);
        }
    }
    
    public void instanciarTelaCadastroMaquina(Maquina maquina, Frame pai, int CENARIO){
        cadastroMaquina = new JDCadastroMaquina(pai, true, ciInterface, CENARIO, maquina);
        cadastroMaquina.setVisible(true);
    }

    public void cadastrarMaquina(){
        
    }
    
    public boolean alterarMaquina(Maquina maquina){
        try{  
            gtMaquina.alterarMaquina(maquina);
            JOptionPane.showMessageDialog(cadastroMaquina, "Alterada com sucesso!");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(cadastroMaquina, "Erro ao alterar: " + e.getMessage());
            return false;
        }
    }
    
    public void consultarMaquina(){
       
    }
    
    public void excluirMaquina(){
        
    }    
}
