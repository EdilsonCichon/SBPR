package cci;

import cci.util.Cenario;
import cdp.Funcionario;
import cgt.GTFuncionario;
import javax.swing.JFrame;
import cih.funcionario.JDCadastroFuncionario;
import cih.funcionario.JDPesquisaFuncionario;
import java.awt.Frame;
import java.util.LinkedList;

public class CIFuncionario {
    
    private CIInterface ciInterface;
    private GTFuncionario gtFuncionario;
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
    
    public void cadastrarFuncionario(){
        int i = gtFuncionario.cadastrarFuncionario();
    }
    
    public void alterarFuncionario(){
        int i = gtFuncionario.alterarFuncionario();
    }
    
    public LinkedList<Funcionario> consultarFuncionario(String tipoFiltro, String texto){
        return gtFuncionario.consultarFuncionario(tipoFiltro, texto);
    }
    
    public void excluirFuncionario(){
        int i = gtFuncionario.excluirFuncionario();
    }
    
}
