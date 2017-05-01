package cci;

import cci.util.Constante;
import cgt.GTTipoServico;
import javax.swing.JFrame;
import cih.tipoServico.JDCadastroTipoServico;
import cih.tipoServico.JDPesquisaTipoServico;

public class CITipoServico {
    
    private CIInterface ciInterface;
    private GTTipoServico gtTipoServico;

    public CITipoServico(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtTipoServico = new GTTipoServico();
    }
    
    public void gerenciarTipoServico(int codCrud, JFrame pai) {
        
        JDCadastroTipoServico cadastroTipoServico;
        JDPesquisaTipoServico pesquisaTipoServico;

        if (codCrud == Constante.CADASTRAR) {
            cadastroTipoServico = new JDCadastroTipoServico(pai, true, ciInterface);
            cadastroTipoServico.setVisible(true);
        } else if (codCrud > Constante.ALTERAR) {
            pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, ciInterface);
            pesquisaTipoServico.setVisible(true);
        } else if (codCrud == Constante.CONSULTAR) {
            pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, ciInterface);
            pesquisaTipoServico.setVisible(true);
        } else if (codCrud == Constante.EXCLUIR) {
            pesquisaTipoServico = new JDPesquisaTipoServico(pai, true, ciInterface);
            pesquisaTipoServico.setVisible(true);
        }
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
