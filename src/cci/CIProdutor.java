package cci;

import cgt.GTProdutor;
import javax.swing.JFrame;
import cih.produtor.JDCadastroProdutor;
import cih.produtor.JDPesquisaProdutor;
import javax.swing.JOptionPane;

public class CIProdutor {
    
    private CIInterface ciInterface;
    private GTProdutor gtProdutor;
    private final int cadastrar = 0;
    private final int alterar = 1;
    private final int consultar = 2;
    private final int excluir = 3;

    public CIProdutor(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtProdutor = new GTProdutor();
    }
    
    public void gerenciarProdutor(int codCrud, JFrame pai) {
        
        JDCadastroProdutor cadastroProdutor;
        JDPesquisaProdutor pesquisaProdutor;

        if (codCrud == cadastrar) {
            cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface);
            cadastroProdutor.setVisible(true);
        } else if (codCrud == alterar) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, alterar);
            pesquisaProdutor.setVisible(true);
        }else if (codCrud == consultar) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, consultar);
            pesquisaProdutor.setVisible(true);
        }else if (codCrud == excluir) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, excluir);
            pesquisaProdutor.setVisible(true);
        }
    }
    
    public void cadastrarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo){
        
        try{   
          gtProdutor.cadastrarProdutor(nome, cpf, data_nasc, inscricao, rg, telefone, sexo); 
          JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        }  
    }
    
    public void alterarProdutor(int id){
      
    }
    
    public void consultarProdutor(int id){
      
    }
    
    public void excluirProdutor(int id){
        
        try{   
          gtProdutor.excluirProdutor(id);
          JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
        }    
    }
}
