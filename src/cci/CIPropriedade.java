package cci;

import cci.util.Constante;
import cdp.Propriedade;
import cgt.GTPropriedade;
import javax.swing.JFrame;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class CIPropriedade {
    
    private CIInterface ciInterface;
    private GTPropriedade gtPropriedade;
    JDCadastroPropriedade cadastroPropriedade;
    JDPesquisaPropriedade pesquisaPropriedade;
        
    public CIPropriedade(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtPropriedade = new GTPropriedade();
    }
    
    public void gerenciarPropriedade(int cenario, JFrame pai) {
        
        if (cenario == Constante.CADASTRAR) {
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, cenario, null);
            cadastroPropriedade.setVisible(true);
        } else{
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface, cenario);
            pesquisaPropriedade.setVisible(true);
        }
    }
    
    public void instanciarTelaCadastroPropriedade(Propriedade propriedade, Frame pai, int cenario) {
        cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, cenario, propriedade);
        cadastroPropriedade.setVisible(true);
    }
    
    
    public boolean cadastrarPropriedade(String responsavel, String nome, String referencia){
        
        try{   
          gtPropriedade.cadastrarPropriedade(responsavel, nome, referencia);
          JOptionPane.showMessageDialog(null, "Cadastrada com sucesso!");
          return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }    
    }
    
    public void alterarPropriedade(){
        gtPropriedade.alterarPropriedade();
    }
    
    public void consultarPropriedade(){
        gtPropriedade.consultarPropriedade();
    }
    
    public void excluirPropriedade(){
        gtPropriedade.excluirPropriedade();
        JOptionPane.showMessageDialog(null, "Propriedade excluída com sucesso");
    }    
}
