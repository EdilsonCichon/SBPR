package cci;

import cci.util.Constante;
import cgt.GTServico;
import javax.swing.JFrame;
import cih.servico.JDCadastroServico;
import cih.servico.JDPesquisaServico;

public class CIServico {
    
    private CIInterface ciInterface;
    private GTServico gtServico;

    public CIServico(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtServico = new GTServico();
    }
    
     public void gerenciarServico(int codCrud, JFrame pai) {

        if (codCrud == Constante.AGENDAR) {
            JDCadastroServico agendarServico = new JDCadastroServico(pai, true, ciInterface);
            agendarServico.setVisible(true);
        } else if (codCrud == Constante.ALTERAR) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, ciInterface);
            consultarServico.setVisible(true);
        } else if (codCrud == Constante.CONSULTAR) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, ciInterface);
            consultarServico.setVisible(true);
        } else if (codCrud == Constante.CONCLUIR) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, ciInterface);
            consultarServico.setVisible(true);
        } else if (codCrud == Constante.CANCELAR) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, ciInterface);
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
