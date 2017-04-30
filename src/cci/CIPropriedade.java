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
    
    public void gerenciarPropriedade(JFrame pai, String responsavel) {
        
        JDCadastroPropriedade cadastroPropriedade;
        
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, responsavel);
            cadastroPropriedade.setVisible(true);
    }
    
    
    public void cadastrarPropriedade(JDCadastroPropriedade cadastroPropriedade, String responsavel, String nome, String referencia){
        
        try{   
          gtPropriedade.cadastrarPropriedade(responsavel, nome, referencia);
          JOptionPane.showMessageDialog(null, "Cadastrada com sucesso!");
          cadastroPropriedade.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        }    
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
