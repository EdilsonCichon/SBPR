package cci;

import javax.swing.JFrame;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;

/**
 *
 * @author Edilson
 */
public class ControlPropriedade {
    
    private ControlInterfaces controlInterfaces;

    public ControlPropriedade(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
    }
    
    public void gerenciarPropriedade(int codCrud, JFrame pai) {
        
        JDCadastroPropriedade cadastroPropriedade;
        JDPesquisaPropriedade pesquisaPropriedade;
        
        if (codCrud == 0) {
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, controlInterfaces);
            cadastroPropriedade.setVisible(true);
        } else if (codCrud == 1) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, controlInterfaces);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == 2) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, controlInterfaces);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == 3) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, controlInterfaces);
            pesquisaPropriedade.setVisible(true);
        }

    }
    
}
