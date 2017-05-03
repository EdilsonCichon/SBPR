package cci;

import cci.util.Constante;
import cdp.Produtor;
import cgt.GTProdutor;
import javax.swing.JFrame;
import cih.produtor.JDCadastroProdutor;
import cih.produtor.JDPesquisaProdutor;
import java.awt.Frame;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class CIProdutor {
    
    private CIInterface ciInterface;
    private GTProdutor gtProdutor;

    public CIProdutor(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtProdutor = new GTProdutor();
    }
    
    public void gerenciarProdutor(int codCrud, JFrame pai) {
        
        JDCadastroProdutor cadastroProdutor;
        JDPesquisaProdutor pesquisaProdutor;

        if (codCrud == Constante.CADASTRAR) {
            cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, codCrud, null);
            cadastroProdutor.setVisible(true);
        } else if(codCrud == Constante.ALTERAR){
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, codCrud);
            pesquisaProdutor.setVisible(true);
        }else if (codCrud == Constante.CONSULTAR) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, codCrud);
            pesquisaProdutor.setVisible(true);
        } else if (codCrud == Constante.EXCLUIR) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, codCrud);
            pesquisaProdutor.setVisible(true);
        }
    }
    
    public boolean cadastrarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo){
        
        try{   
          gtProdutor.cadastrarProdutor(nome, cpf, data_nasc, inscricao, rg, telefone, sexo); 
          JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
          return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }  
    }
    
    public void alterarProdutor(Produtor produtor){
      
    }
    
    public void consultarProdutor(Produtor produtor, Frame pai) {
       JDCadastroProdutor cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, Constante.CONSULTAR, produtor);
       cadastroProdutor.setVisible(true);
    }
    
    public void excluirProdutor(Produtor produtor){
        
        try{   
          gtProdutor.excluirProdutor(produtor);
          JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
        }    
    }
    
    public LinkedList<Produtor> filtroProdutores(String colunaFiltro, String filtro){
       return gtProdutor.filtrarProdutores(colunaFiltro, filtro);
    }
}
