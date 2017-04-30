package cci;

import cci.util.Crud;
import cdp.Produtor;
import cgt.GTProdutor;
import javax.swing.JFrame;
import cih.produtor.JDCadastroProdutor;
import cih.produtor.JDPesquisaProdutor;
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

        if (codCrud == Crud.CADASTRAR) {
            cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface);
            cadastroProdutor.setVisible(true);
        } else {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, codCrud);
            pesquisaProdutor.setVisible(true);
        }
    }
    
    public void cadastrarProdutor(JDCadastroProdutor cadastroProdutor, String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo){
        
        try{   
          gtProdutor.cadastrarProdutor(nome, cpf, data_nasc, inscricao, rg, telefone, sexo); 
          JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
          cadastroProdutor.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        }  
    }
    
    public void alterarProdutor(int id){
      
    }
    
    public void consultarProdutor(int id) {
       
    }
    
    public void excluirProdutor(int id){
        
        try{   
          gtProdutor.excluirProdutor(id);
          JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
        }    
    }
    
    public LinkedList<Produtor> filtroProdutores(String colunaFiltro, String filtro){
       return gtProdutor.filtrarProdutores(colunaFiltro, filtro);
    }
}
