package cci;

import cci.util.Cenario;
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
    
    public void gerenciarProdutor(int CENARIO, JFrame pai) {
       
        if (CENARIO == Cenario.CADASTRAR) {
            cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, CENARIO, null);
            cadastroProdutor.setVisible(true);
        } else{
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, CENARIO);
            pesquisaProdutor.setVisible(true);
        }
    }
    
    public void instanciarTelaCadastroProdutor(Produtor produtor, Frame pai, int CENARIO){
        cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, CENARIO, produtor);
        cadastroProdutor.setVisible(true);
    }
     
    public Produtor instanciarTelaFiltroProdutor(Frame pai, int CENARIO){
         
        Produtor produtorSelecionado = null;
        
        pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, CENARIO, produtorSelecionado);
        pesquisaProdutor.setVisible(true);
        return produtorSelecionado;
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
    
    public boolean alterarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) { //Erick
        try {
            gtProdutor.alterarProdutor(nome, cpf, data_nasc, inscricao, rg, telefone, sexo);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage());
            return false;
        }
    }
    
    public void consultarProdutor(Produtor produtor, Frame pai) {
       
    }

    public boolean excluirProdutor(Produtor produtor){
        
        try{   
            gtProdutor.excluirProdutor(produtor);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
            return false;
        }    
    }
    
    public LinkedList<Produtor> filtroProdutores(String colunaFiltro, String filtro){
       return gtProdutor.filtrarProdutores(colunaFiltro, filtro);
    }
}
