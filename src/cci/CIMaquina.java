package cci;

import cci.util.Cenario;
import cdp.Maquina;
import cdp.TipoMaquina;
import cgt.GTMaquina;
import javax.swing.JFrame;
import cih.maquina.JDCadastroMaquina;
import cih.maquina.JDPesquisarMaquina;
import java.awt.Frame;
import java.util.List;
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
        if (CENARIO == Cenario.CADASTRAR)
            instanciarTelaCadastroMaquina(null, pai, CENARIO);
        else
            instanciarTelaFiltroMaquina(pai, CENARIO);
    }
    
    public void instanciarTelaCadastroMaquina(Maquina maquina, Frame pai, int CENARIO){
        cadastroMaquina = new JDCadastroMaquina(pai, true, ciInterface, CENARIO, maquina);
        cadastroMaquina.setVisible(true);
    }
    
    public void instanciarTelaFiltroMaquina(Frame pai, int CENARIO) {
        pesquisaMaquina = new JDPesquisarMaquina(pai, true, ciInterface, CENARIO);
        pesquisaMaquina.setVisible(true);
    }

    public boolean cadastrarMaquina(String modelo, String placa, TipoMaquina tipoMaquina){
        try{  
            gtMaquina.cadastrarMaquina(modelo, placa, tipoMaquina);
            JOptionPane.showMessageDialog(null, "Cadastrada com sucesso!");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean alterarMaquina(Maquina maquina, String modelo, String placa, TipoMaquina tipoMaquina){
        try{  
            gtMaquina.alterarMaquina(maquina, modelo, placa, tipoMaquina);
            JOptionPane.showMessageDialog(cadastroMaquina, "Alterada com sucesso!");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(cadastroMaquina, "Erro ao alterar: " + e.getMessage());
            return false;
        }
    }
    
    public List<Maquina> filtrarMaquina(String colunaFiltro, String filtro){
       return gtMaquina.filtrarMaquina(colunaFiltro, filtro);
    }
    
    public boolean excluirMaquina( Maquina maquina){
        try {
            gtMaquina.excluirMaquina(maquina);
            JOptionPane.showMessageDialog(null, "Maquina excluída com sucesso");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir maquina: " + e.getMessage());
            return false;
        }
    }    
}
