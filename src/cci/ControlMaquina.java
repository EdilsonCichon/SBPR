package cci;

import javax.swing.JFrame;
import cih.maquina.JDCadastroMaquina;
import cih.maquina.JDPesquisarMaquina;

/**
 *
 * @author Edilson
 */
public class ControlMaquina {
    
    private ControlInterfaces controlInterfaces;

    public ControlMaquina(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
    }
    
    public void gerenciarMaquina(int codCrud, JFrame pai) {
        JDCadastroMaquina cadastroMaquina;
        JDPesquisarMaquina pesquisaMaquina; 
        if (codCrud == 0) {
            cadastroMaquina = new JDCadastroMaquina(pai, true, controlInterfaces);
            cadastroMaquina.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaMaquina = new JDPesquisarMaquina(pai, true, controlInterfaces);
            pesquisaMaquina.setVisible(true);
        }
    }    
}
