package cci;

import cgt.GTPropriedade;
import javax.swing.JFrame;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;

/**
 *
 * @author Edilson
 */
public class ControlPropriedade {
    
    private ControlInterface controlInterface;
    private GTPropriedade gtPropriedade;

    public ControlPropriedade(ControlInterface controlInterfaces) {
        this.controlInterface = controlInterfaces;
        //gtPropriedade = new GTPropriedade();
    }
    
    public void gerenciarPropriedade(int codCrud, JFrame pai) {
        
        JDCadastroPropriedade cadastroPropriedade;
        JDPesquisaPropriedade pesquisaPropriedade;
        
        if (codCrud == 0) {
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, controlInterface);
            cadastroPropriedade.setVisible(true);
        } else if (codCrud == 1) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, controlInterface);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == 2) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, controlInterface);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == 3) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, controlInterface);
            pesquisaPropriedade.setVisible(true);
        }

    }
    
    public void cadastrarPropriedade(){
        int i = gtPropriedade.cadastrarPropriedade();
    }
    
    public void alterarPropriedade(){
        int i = gtPropriedade.alterarPropriedade();
    }
    
    public void consultarPropriedade(){
        int i = gtPropriedade.consultarPropriedade();
    }
    
    public void excluirPropriedade(){
        int i = gtPropriedade.excluirPropriedade();
    }    
}
