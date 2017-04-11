package cci;

import javax.swing.JFrame;
import cih.tipoServico.JDCadastroTipoServico;
import cih.tipoServico.JDPesquisaTipoServico;

/**
 *
 * @author Edilson
 */
public class ControlTipoServico {
    
    private ControlInterfaces controlInterfaces;

    public ControlTipoServico(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
    }
    
    public void gerenciarTipoServico(int codCrud, JFrame pai) {
        JDCadastroTipoServico cadastroTipoServico;
        JDPesquisaTipoServico pesquisaTipoServico;

        if (codCrud == 0) {
            cadastroTipoServico = new JDCadastroTipoServico(pai, true, controlInterfaces);
            cadastroTipoServico.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, controlInterfaces);
            pesquisaTipoServico.setVisible(true);
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
