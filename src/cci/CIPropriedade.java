package cci;

import cgt.GTPropriedade;
import javax.swing.JFrame;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;
import javax.swing.JOptionPane;

public class CIPropriedade {
    
    private CIInterface ciInterface;
    private GTPropriedade gtPropriedade;

    public CIPropriedade(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtPropriedade = new GTPropriedade();
    }
    
    public void gerenciarPropriedade(int codCrud, JFrame pai) {
        
        JDCadastroPropriedade cadastroPropriedade;
        JDPesquisaPropriedade pesquisaPropriedade;
        
        if (codCrud == 0) {
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface);
            cadastroPropriedade.setVisible(true);
        } else if (codCrud == 1) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == 2) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == 3) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface);
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
        JOptionPane.showMessageDialog(null, "Propriedade excluída com sucesso");
    }    
}
