package cci;

import cci.util.Constante;
import cdp.Produtor;
import cdp.Propriedade;
import cgt.GTPropriedade;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;
import java.awt.Frame;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class CIPropriedade {
    
    private CIInterface ciInterface;
    private GTPropriedade gtPropriedade;

    public CIPropriedade(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtPropriedade = new GTPropriedade();
    }
    
    public void gerenciarPropriedade(int codCrud, Frame pai) {
        
        JDCadastroPropriedade cadastroPropriedade;
        JDPesquisaPropriedade pesquisaPropriedade;
        
        if (codCrud == Constante.CADASTRAR) {
            cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, Constante.CADASTRAR, null);
            cadastroPropriedade.setVisible(true);
        } else {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface, codCrud);
            pesquisaPropriedade.setVisible(true);
        }
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
        int i = gtPropriedade.consultarPropriedade();
    }
    
    public void excluirPropriedade(){
        int i = gtPropriedade.excluirPropriedade();
        JOptionPane.showMessageDialog(null, "Propriedade excluída com sucesso");
    }
    
    public LinkedList<Propriedade> filtroProdutores(String colunaFiltro, String filtro) {
        return gtPropriedade.filtrarProdutores(colunaFiltro, filtro);
    }
}
