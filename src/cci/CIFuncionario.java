package cci;

import cci.util.Cenario;
import cdp.Cargo;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.TipoServico;
import cdp.Usuario;
import cdp.endereco.Cep;
import cgt.GTFuncionario;
import javax.swing.JFrame;
import cih.funcionario.JDCadastroFuncionario;
import cih.funcionario.JDPesquisaFuncionario;
import java.awt.Frame;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class CIFuncionario {
    
    private CIInterface ciInterface;
    private GTFuncionario gtFuncionario;
    private JDCadastroFuncionario cadastroFuncionario;
    private JDPesquisaFuncionario pesquisaFuncionario;

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
    
    public boolean cadastrarFuncionario(
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, Usuario usuario,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado, String tipoLogradouro, String complemento, Cep cepAtual, List tiposServicos) {
        
        try {
          gtFuncionario.cadastrarFuncionario(
                   nome, cpf, rg, email, data_nasc, telefone, sexo, cargo, 
                   habilitacao, usuario, cep, logradouro, numero,
                   bairro, cidade, estado, tipoLogradouro, complemento, cepAtual, tiposServicos);
            
          JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
          return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean alterarFuncionario(Funcionario funcionario,
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, String login, String senha,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado, String tipoLogradouro, String complemento, Cep cepAtual, List tipoServicos){
        
        try {
            gtFuncionario.alterarFuncionario(funcionario,
                   nome, cpf, rg, email, data_nasc, telefone, sexo, cargo, 
                   habilitacao, login, senha, cep, logradouro, numero,
                   bairro, cidade, estado, tipoLogradouro, complemento, cepAtual, tipoServicos);
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " + e.getMessage());
            return false;
        }
    }
    
    public List<Funcionario> filtrarFuncionario(String tipoFiltro, String texto){
        return gtFuncionario.filtrarFuncionario(tipoFiltro, texto);
    }
    
    public boolean excluirFuncionario(Funcionario funcionario) {
        try {
            gtFuncionario.excluirFuncionario(funcionario);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
            return false;
        }
    }
}
