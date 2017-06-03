package cci;

import cci.util.Cenario;
import cdp.Produtor;
import cdp.Propriedade;
import cdp.Servico;
import cdp.ServicoAgendado;
import cdp.TipoServico;
import cgt.GTServico;
import cih.servico.JDCadastroServico;
import cih.servico.JDPesquisaServico;
import java.awt.Frame;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CIServico {
    
    private CIInterface ciInterface;
    private GTServico gtServico;
    private JDCadastroServico agendarServico;
    private JDPesquisaServico pesquisaServico;

    public CIServico(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtServico = new GTServico();
    }
    
     public void gerenciarServico(int CENARIO, JFrame pai) {

        if(CENARIO == Cenario.AGENDAR)
            instanciarTelaCadastroServico(null, pai, CENARIO);
        else
            instanciarTelaFiltroServico(pai, CENARIO);    
    }
     
    public void instanciarTelaCadastroServico(Servico servico, Frame pai, int CENARIO){
        agendarServico = new JDCadastroServico(pai, true, ciInterface, CENARIO, servico);
        agendarServico.setVisible(true);
    }
     
    public void instanciarTelaFiltroServico(Frame pai, int CENARIO){
        pesquisaServico = new JDPesquisaServico(pai, true, ciInterface, CENARIO);
        pesquisaServico.setVisible(true);
    }
    
     public ServicoAgendado cadastrarServico(Produtor produtor, Propriedade propriedade, 
             TipoServico tipoServico, String dtPrevistaConclusao, String qtdHrsPrevista) {
         try {
             JOptionPane.showMessageDialog(agendarServico, "Cadastrado com sucesso!");
             return gtServico.cadastrarServico(produtor, propriedade, tipoServico, dtPrevistaConclusao, qtdHrsPrevista);
         } catch (Exception e) {
             JOptionPane.showMessageDialog(agendarServico, "Não foi possível agendar o serviço: "+e.getMessage());
             return null;
         }
     }
     
     public boolean alterarServico(Servico servico, Produtor produtor, Propriedade propriedade, 
            TipoServico tipoServico, String dtPrevistaConclusao, String qtdHrsPrevista){
        try {
            gtServico.alterarServico(servico, produtor, propriedade, tipoServico, dtPrevistaConclusao, qtdHrsPrevista);
            JOptionPane.showMessageDialog(agendarServico, "Alterado com sucesso!");
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(agendarServico, "Erro ao alterar " + ex.getMessage());
            return false;
        }
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
     
     public List<Servico> filtrarServicoTipo(int tipoServico_id) {
        return gtServico.filtrarServicoTipo(tipoServico_id);
     }   
     public List<Servico> filtrarServico(int produtor_id, int propriedade_id) {
        return gtServico.filtrarServico(produtor_id, propriedade_id);
    }   
}
