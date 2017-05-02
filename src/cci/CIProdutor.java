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
    JDCadastroProdutor cadastroProdutor;
    JDPesquisaProdutor pesquisaProdutor;

    public CIProdutor(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtProdutor = new GTProdutor();
    }
    
    public void gerenciarProdutor(int cenario, JFrame pai) {
      
        if (cenario == Constante.CADASTRAR) {
            cadastrarProdutor(cenario, pai);
            
        } else if(cenario == Constante.ALTERAR){
            alterarProdutor(null, pai);
            
        }else if (cenario == Constante.CONSULTAR) {
            consultarProdutor(null, pai);
            
        } else if (cenario == Constante.EXCLUIR) {
            excluirProdutor(null, pai);
        }
    }
    
    public void cadastrarProdutor(int cenario, JFrame pai){
        cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, cenario, null);
        cadastroProdutor.setVisible(true);
    }
    
    public void alterarProdutor(Produtor produtor, Frame pai){
        cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, Constante.ALTERAR, produtor);
        cadastroProdutor.setVisible(true);
    }
    
    public void consultarProdutor(Produtor produtor, Frame pai) {
       cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, Constante.CONSULTAR, produtor);
       cadastroProdutor.setVisible(true);
    }
    
    public void excluirProdutor(Produtor produtor, Frame pai) {
       cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, Constante.EXCLUIR, produtor);
       cadastroProdutor.setVisible(true);
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

    public boolean alterarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo){
        
        try{   
          gtProdutor.alterarProdutor(nome, cpf, data_nasc, inscricao, rg, telefone, sexo); 
          JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
          return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage());
            return false;
        }  
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
