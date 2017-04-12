package cci;

import cgt.GTTipoServico;
import javax.swing.JFrame;
import cih.tipoServico.JDCadastroTipoServico;
import cih.tipoServico.JDPesquisaTipoServico;

/**
 *
 * @author Edilson
 */
public class ControlTipoServico {
    
    private ControlInterface controlInterface;
    private GTTipoServico gtTipoServico;

    public ControlTipoServico(ControlInterface controlInterfaces) {
        this.controlInterface = controlInterfaces;
        //gtTipoServico = new GTTipoServico();
    }
    
    public void gerenciarTipoServico(int codCrud, JFrame pai) {
        JDCadastroTipoServico cadastroTipoServico;
        JDPesquisaTipoServico pesquisaTipoServico;

        if (codCrud == 0) {
            cadastroTipoServico = new JDCadastroTipoServico(pai, true, controlInterface);
            cadastroTipoServico.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, controlInterface);
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
    
    public void cadastrarTipoServico(){
        int i = gtTipoServico.cadastrarTipoServico();
    }
    
    public void alterarTipoServico(){
        int i = gtTipoServico.alterarTipoServico();
    }
    
    public void consultarTipoServico(){
        int i = gtTipoServico.consultarTipoServico();
    }
    
    public void excluirTipoServico(){
        int i = gtTipoServico.excluirTipoServico();
    } 
    
}
