package cci;

import javax.swing.JFrame;
import cih.funcionario.JDCadastroFuncionario;
import cih.funcionario.JDPesquisaFuncionario;

/**
 *
 * @author Edilson
 */
public class ControlFuncionario {
    
    private ControlInterfaces controlInterfaces;

    public ControlFuncionario(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
    }
    
    public void gerenciarFuncionario(int codCrud, JFrame pai) {
        
        JDCadastroFuncionario cadastroFuncionario;
        JDPesquisaFuncionario pesquisaFuncionario;

        if (codCrud == 0) {
            cadastroFuncionario = new JDCadastroFuncionario(pai, true, controlInterfaces);
            cadastroFuncionario.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true, controlInterfaces);
            pesquisaFuncionario.setVisible(true);
        }
//        } else if (codCrud == 2) {
//            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
//            pesquisaFuncionario.setVisible(true);
//        } else if (codCrud == 3) {
//            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
//            pesquisaFuncionario.setVisible(true);
//        }
    }
    
}
