package cci;

import javax.swing.JFrame;
import cih.servico.JDCadastroServico;
import cih.servico.JDPesquisaServico;

/**
 *
 * @author Edilson
 */
public class ControlServico {
    
    private ControlInterfaces controlInterfaces;

    public ControlServico(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
    }
    
     public void gerenciarServico(int codCrud, JFrame pai) {

        if (codCrud == 0) {
            JDCadastroServico agendarServico = new JDCadastroServico(pai, true, controlInterfaces);
            agendarServico.setVisible(true);
        } else if (codCrud == 1) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, controlInterfaces);
            consultarServico.setVisible(true);
        } else if (codCrud == 2) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, controlInterfaces);
            consultarServico.setVisible(true);
        } else if (codCrud == 3) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, controlInterfaces);
            consultarServico.setVisible(true);
        } else if (codCrud == 4) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, controlInterfaces);
            consultarServico.setVisible(true);
        }
    }
    
}
