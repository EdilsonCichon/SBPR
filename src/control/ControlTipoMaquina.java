package control;

import javax.swing.JFrame;
import windows.tipoMaquina.JDCadastroTipoMaquina;
import windows.tipoMaquina.JDPesquisarTipoMaquina;

/**
 *
 * @author Edilson
 */
public class ControlTipoMaquina {
    
    private ControlInterfaces controlInterfaces;

    public ControlTipoMaquina(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
    }
    
        public void gerenciarTipoMaquina(int codCrud, JFrame pai) {
        JDCadastroTipoMaquina cadastroTipoMaquina;
        JDPesquisarTipoMaquina pesquisaTipoMaquina; 
        if (codCrud == 0) {
            cadastroTipoMaquina = new JDCadastroTipoMaquina(pai, true, controlInterfaces);
            cadastroTipoMaquina.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaTipoMaquina = new JDPesquisarTipoMaquina(pai, true, controlInterfaces);
            pesquisaTipoMaquina.setVisible(true);
        }
    }

    
}
