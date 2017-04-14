package cci;

import cgt.GTFuncionario;
import javax.swing.JFrame;
import cih.funcionario.JDCadastroFuncionario;
import cih.funcionario.JDPesquisaFuncionario;

public class CIFuncionario {
    
    private CIInterface ciInterface;
    private GTFuncionario gtFuncionario;

    public CIFuncionario(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtFuncionario = new GTFuncionario();
    }
    
    public void gerenciarFuncionario(int codCrud, JFrame pai) {
        
        JDCadastroFuncionario cadastroFuncionario;
        JDPesquisaFuncionario pesquisaFuncionario;

        if (codCrud == 0) {
            cadastroFuncionario = new JDCadastroFuncionario(pai, true, ciInterface);
            cadastroFuncionario.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true, ciInterface);
            pesquisaFuncionario.setVisible(true);
        }
//         else if (codCrud == 2) {
//            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
//            pesquisaFuncionario.setVisible(true);
//        } else if (codCrud == 3) {
//            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
//            pesquisaFuncionario.setVisible(true);
//        }
    }
    
    public void cadastrarFuncionario(){
        int i = gtFuncionario.cadastrarFuncionario();
    }
    
    public void alterarFuncionario(){
        int i = gtFuncionario.alterarFuncionario();
    }
    
    public void consultarFuncionario(){
        int i = gtFuncionario.consultarFuncionario();
    }
    
    public void excluirFuncionario(){
        int i = gtFuncionario.excluirFuncionario();
    }
    
}
