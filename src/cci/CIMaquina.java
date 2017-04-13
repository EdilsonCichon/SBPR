package cci;

import cgt.GTMaquina;
import javax.swing.JFrame;
import cih.maquina.JDCadastroMaquina;
import cih.maquina.JDPesquisarMaquina;

/**
 *
 * @author Edilson
 */
public class CIMaquina {
    
    private CIInterface controlInterface;
    private GTMaquina gtMaquina;

    public CIMaquina(CIInterface controlInterfaces) {
        this.controlInterface = controlInterfaces;
        gtMaquina = new GTMaquina();
    }
    
    public void gerenciarMaquina(int codCrud, JFrame pai) {
        JDCadastroMaquina cadastroMaquina;
        JDPesquisarMaquina pesquisaMaquina; 
        if (codCrud == 0) {
            cadastroMaquina = new JDCadastroMaquina(pai, true, controlInterface);
            cadastroMaquina.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaMaquina = new JDPesquisarMaquina(pai, true, controlInterface);
            pesquisaMaquina.setVisible(true);
        }
    }

    public void cadastrarMaquina(){
        int i = gtMaquina.cadastrarMaquina();
    }
    
    public void alterarMaquina(){
        int i = gtMaquina.alterarMaquina();
    }
    
    public void consultarMaquina(){
        int i = gtMaquina.consultarMaquina();
    }
    
    public void excluirMaquina(){
        int i = gtMaquina.excluirMaquina();
    }    
}
