package cci;

import cci.util.Cenario;
import cdp.Cargo;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.Usuario;
import cdp.endereco.Cep;
import cgt.GTFuncionario;
import javax.swing.JFrame;
import cih.funcionario.JDCadastroFuncionario;
import cih.funcionario.JDPesquisaFuncionario;
import java.awt.Frame;
import java.util.List;

public class CIFuncionario {
    
    private CIInterface ciInterface;
    private GTFuncionario gtFuncionario;
    private JDCadastroFuncionario cadastroFuncionario;
    private JDPesquisaFuncionario pesquisaFuncionario;
    private Funcionario funcionarioSelecionado;

    public CIFuncionario(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtFuncionario = new GTFuncionario();
    }
    
    public void gerenciarFuncionario(int CENARIO, JFrame pai) {
       
        if (CENARIO == Cenario.CADASTRAR)
            instanciarTelaCadastroFuncionario(null, pai, CENARIO);
        else
            instanciarTelaFiltroFuncionario(pai, CENARIO);
    }
    
    public Usuario instanciarUsuario(String login, String senha){
        return gtFuncionario.instanciarUsuario(login, senha);
    }
    
    public void instanciarTelaCadastroFuncionario(Funcionario funcionario, Frame pai, int CENARIO) {
        cadastroFuncionario = new JDCadastroFuncionario(pai, true, ciInterface, CENARIO, funcionario);
        cadastroFuncionario.setVisible(true);
    }
    
    public void instanciarTelaFiltroFuncionario(Frame pai, int CENARIO) {
        pesquisaFuncionario = new JDPesquisaFuncionario(pai, true, ciInterface, CENARIO);
        pesquisaFuncionario.setVisible(true);
    }
    
    public void cadastrarFuncionario(
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, Usuario usuario,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado, String tipoLogradouro, 
            String complemento, Cep cepAtual, List tiposServicos) throws Exception {
        
        try {
            gtFuncionario.cadastrarFuncionario(
                   nome, cpf, rg, email, data_nasc, telefone, sexo, cargo, 
                   habilitacao, usuario, cep, logradouro, numero,
                   bairro, cidade, estado, tipoLogradouro, complemento, cepAtual, tiposServicos);
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroFuncionario, "Cadastrado com Sucesso");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroFuncionario, e.getMessage());
        }
    }
    
    public void alterarFuncionario(Funcionario funcionario,
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, String login, String senha,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado, String tipoLogradouro, 
            String complemento, Cep cepAtual, List tipoServicos) throws Exception{
        
        try {
            gtFuncionario.alterarFuncionario(funcionario,
                   nome, cpf, rg, email, data_nasc, telefone, sexo, cargo, 
                   habilitacao, login, senha, cep, logradouro, numero,
                   bairro, cidade, estado, tipoLogradouro, complemento, cepAtual, tipoServicos); 
            ciInterface.getCiMensagem().exibirMensagemSucesso(cadastroFuncionario, "Alterado com Sucesso");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroFuncionario, e.getMessage());
        }
    }
    
    public List<Funcionario> filtrarFuncionario(String tipoFiltro, String texto){
        return gtFuncionario.filtrarFuncionario(tipoFiltro, texto);
    }
    
    public void excluirFuncionario(Funcionario funcionario) throws Exception {
        try {
            gtFuncionario.excluirFuncionario(funcionario);
            ciInterface.getCiMensagem().exibirMensagemConfirmacao(cadastroFuncionario, "Excluído com sucesso!");
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(cadastroFuncionario, e.getMessage());
        }
    }

    public Funcionario getFuncionarioSelecionado() {
        return funcionarioSelecionado;
    }

    public void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
        this.funcionarioSelecionado = funcionarioSelecionado;
    }
}
