package cci;

import cci.util.Cenario;
import cdp.Funcionario;
import cgt.GTFuncionario;
import javax.swing.JFrame;
import cih.funcionario.JDCadastroFuncionario;
import cih.funcionario.JDPesquisaFuncionario;
import java.awt.Frame;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class CIFuncionario {
    
    private final CIInterface ciInterface;
    private final GTFuncionario gtFuncionario;
    JDCadastroFuncionario cadastroFuncionario;
    JDPesquisaFuncionario pesquisaFuncionario;

    public CIFuncionario(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtFuncionario = new GTFuncionario();
    }
    
    public void gerenciarFuncionario(int CENARIO, JFrame pai) {
       
        if (CENARIO == Cenario.CADASTRAR) {
            cadastroFuncionario = new JDCadastroFuncionario(pai, true, ciInterface, CENARIO, null);
            cadastroFuncionario.setVisible(true);
        } else {
           pesquisaFuncionario = new JDPesquisaFuncionario(pai, true, ciInterface, CENARIO);
            pesquisaFuncionario.setVisible(true);
        }
    }
    
    public void instanciarTelaCadastroFuncionario(Funcionario funcionario, Frame pai, int CENARIO){
        cadastroFuncionario = new JDCadastroFuncionario(pai, true, ciInterface, CENARIO, funcionario);
        cadastroFuncionario.setVisible(true);
    }
    
    public boolean cadastrarFuncionario(
            
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, String cargo,
            String habilitacao, String usuario, String senha,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado) {
        
        try {
          gtFuncionario.cadastrarFuncionario(
                   nome, cpf, rg, email, data_nasc, telefone, sexo, cargo, 
                   habilitacao, usuario, senha, cep, logradouro, numero,
                   bairro, cidade, estado);
            
          JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
          return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean alterarFuncionario(Funcionario funcionario,
            
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, String cargo,
            String habilitacao, String usuario, String senha,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado){
        
        try {
            gtFuncionario.alterarFuncionario(funcionario,
                   nome, cpf, rg, email, data_nasc, telefone, sexo, cargo, 
                   habilitacao, usuario, senha, cep, logradouro, numero,
                   bairro, cidade, estado);
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " + e.getMessage());
            return false;
        }
    }
    
    public List<Funcionario> consultarFuncionario(String tipoFiltro, String texto){
        return gtFuncionario.consultarFuncionario(tipoFiltro, texto);
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
