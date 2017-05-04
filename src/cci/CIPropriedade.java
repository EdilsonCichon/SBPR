package cci;

import cdp.Produtor;
import cdp.Propriedade;
import cgt.GTPropriedade;
import cci.util.Constante;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;
import java.awt.Frame;
import javax.swing.JFrame;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class CIPropriedade {
    
    private CIInterface ciInterface;
    private GTPropriedade gtPropriedade;
    private JDCadastroPropriedade cadastroPropriedade;
    private JDPesquisaPropriedade pesquisaPropriedade;
        
    public CIPropriedade(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtPropriedade = new GTPropriedade();
    }
    
    public void gerenciarPropriedade(int cenario, JFrame pai) {
        
        if (cenario == Constante.CADASTRAR) {
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, Constante.CADASTRAR, null);
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
    
    public boolean cadastrarPropriedade(Produtor responsavel, String nome, String referencia){

        try{   
          gtPropriedade.cadastrarPropriedade(responsavel, nome, referencia);
          JOptionPane.showMessageDialog(null, "Cadastrada com sucesso!");
          return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }    
    }
    
    public void telaAlterarPropriedade(Frame pai, Propriedade propriedade) {
        JDCadastroPropriedade cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, Constante.ALTERAR, propriedade);
        cadastroPropriedade.setVisible(true);
        //alterar título do Frame p/ "Alterar Propriedade"
    }
    
    public void alterarPropriedade(Propriedade propriedade) {
        gtPropriedade.alterarPropriedade(propriedade);
    }
    
    public void consultarPropriedade(){
        gtPropriedade.consultarPropriedade();
    }
    
    public void excluirPropriedade(){
        gtPropriedade.excluirPropriedade();
        JOptionPane.showMessageDialog(null, "Propriedade excluída com sucesso");
    }
    
    public LinkedList<Propriedade> filtroProdutores(String colunaFiltro, String filtro) {
        return gtPropriedade.filtrarProdutores(colunaFiltro, filtro);
    }
}
