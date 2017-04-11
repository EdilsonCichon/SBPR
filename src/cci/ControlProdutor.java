package cci;

import javax.swing.JFrame;
import cih.produtor.JDCadastroProdutor;
import cih.produtor.JDPesquisaProdutor;

/**
 *
 * @author Edilson
 */
public class ControlProdutor {
    
    private ControlInterfaces controlInterfaces;

    public ControlProdutor(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
    }
    
    public void gerenciarProdutor(int codCrud, JFrame pai) {
        
        JDCadastroProdutor cadastroProdutor;
        JDPesquisaProdutor pesquisaProdutor;

        if (codCrud == 0) {
            cadastroProdutor = new JDCadastroProdutor(pai, true, controlInterfaces);
            cadastroProdutor.setVisible(true);
        } else if (codCrud == 1) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, controlInterfaces);
            pesquisaProdutor.setVisible(true);
        } else if (codCrud == 2) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, controlInterfaces);
            pesquisaProdutor.setVisible(true);
        } else if (codCrud == 3) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, controlInterfaces);
            pesquisaProdutor.setVisible(true);
        }
    }
    
}
