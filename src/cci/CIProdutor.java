package cci;

import cdp.Produtor;
import cgt.GTProdutor;
import cci.util.Cenario;
import cih.produtor.JDCadastroProdutor;
import cih.produtor.JDPesquisaProdutor;
import java.util.List;
import java.awt.Frame;
import javax.swing.JFrame;

public class CIProdutor {
    
    private CIInterface ciInterface;
    private GTProdutor gtProdutor;
    private JDCadastroProdutor cadastroProdutor;
    private JDPesquisaProdutor pesquisaProdutor;
    private Produtor produtorSelecionado;
    
    public CIProdutor(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtProdutor = new GTProdutor();
    }
    
    public void gerenciarProdutor(int CENARIO, JFrame pai) {
        if (CENARIO == Cenario.CADASTRAR)
            instanciarTelaCadastroProdutor(null, pai, CENARIO);
        else
            instanciarTelaFiltroProdutor(pai, CENARIO);
    }
    
    public void instanciarTelaCadastroProdutor(Produtor produtor, Frame pai, int CENARIO) {
        cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface, CENARIO, produtor);
        cadastroProdutor.setVisible(true);
    }
     
    public void instanciarTelaFiltroProdutor(Frame pai, int CENARIO){
        
        pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, CENARIO);
        pesquisaProdutor.setVisible(true);
    }
    
    public Produtor instanciarProdutorVazio() {
        return gtProdutor.instanciarProdutorVazio();
    }

    public void cadastrarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo){
        
        try{   
            Produtor produtor = gtProdutor.cadastrarProdutor(nome, cpf, data_nasc, inscricao, rg, telefone, sexo); 
            ciInterface.getCiProdutor().setProdutorSelecionado(produtor);
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroProdutor, "Cadastrado com sucesso!");
        }catch(Exception e){
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroProdutor, e.getMessage());
        }  
    }
    
    public void alterarProdutor(Produtor produtor, String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo){
        try {
            gtProdutor.alterarProdutor(produtor, nome, cpf, data_nasc, inscricao, rg, telefone, sexo);
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroProdutor, "Alterado com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroProdutor, e.getMessage());
        }
    }
    
    public List<Produtor> filtrarProdutor(String colunaFiltro, String filtro) {
       return gtProdutor.filtrarProdutor(colunaFiltro, filtro);
    }
    
    public void excluirProdutor(Produtor produtor){
        
        try{   
            gtProdutor.excluirProdutor(produtor); 
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroProdutor, "Excluído com sucesso!");
        }catch(Exception e){
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroProdutor, e.getMessage());
        }    
    }

    public Produtor getProdutorSelecionado() {
        return produtorSelecionado;
    }
    
    public void setProdutorSelecionado(Produtor produtor) {
        produtorSelecionado = produtor;
    }
}
