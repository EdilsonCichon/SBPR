package cci;

import cgt.GTServico;
import javax.swing.JFrame;
import cih.servico.JDCadastroServico;
import cih.servico.JDPesquisaServico;

/**
 *
 * @author Edilson
 */
public class ControlServico {
    
    private ControlInterface controlInterface;
    private GTServico gtServico;

    public ControlServico(ControlInterface controlInterfaces) {
        this.controlInterface = controlInterfaces;
        //gtServico = new GTServico();
    }
    
     public void gerenciarServico(int codCrud, JFrame pai) {

        if (codCrud == 0) {
            JDCadastroServico agendarServico = new JDCadastroServico(pai, true, controlInterface);
            agendarServico.setVisible(true);
        } else if (codCrud == 1) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, controlInterface);
            consultarServico.setVisible(true);
        } else if (codCrud == 2) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, controlInterface);
            consultarServico.setVisible(true);
        } else if (codCrud == 3) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, controlInterface);
            consultarServico.setVisible(true);
        } else if (codCrud == 4) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, controlInterface);
            consultarServico.setVisible(true);
        }
    }
     
     public void cadastrarServico(){
         int i = gtServico.cadastrarServico();
     }
     
     public void alterarServico(){
         int i = gtServico.alterarServico();
     }
     
     public void consultarServico(){
         int i = gtServico.consultarServico();
     }
     
     public void cancelarServico(){
         int i = gtServico.cancelarServico();
     }
     
     public void concluirServico(){
         int i = gtServico.concluirServico();
     }
    
}
