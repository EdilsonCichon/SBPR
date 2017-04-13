package cci;

import cgt.GTTipoMaquina;
import javax.swing.JFrame;
import cih.tipoMaquina.JDCadastroTipoMaquina;
import cih.tipoMaquina.JDPesquisarTipoMaquina;

/**
 *
 * @author Edilson
 */
public class CITipoMaquina {
    
    private CIInterface controlInterface;
    private GTTipoMaquina gtTipoMaquina;

    public CITipoMaquina(CIInterface controlInterfaces) {
        this.controlInterface = controlInterfaces;
        gtTipoMaquina = new GTTipoMaquina();
    }
    
        public void gerenciarTipoMaquina(int codCrud, JFrame pai) {
        JDCadastroTipoMaquina cadastroTipoMaquina;
        JDPesquisarTipoMaquina pesquisaTipoMaquina; 
        if (codCrud == 0) {
            cadastroTipoMaquina = new JDCadastroTipoMaquina(pai, true, controlInterface);
            cadastroTipoMaquina.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaTipoMaquina = new JDPesquisarTipoMaquina(pai, true, controlInterface);
            pesquisaTipoMaquina.setVisible(true);
        }
    }
        
    public void cadastrarTipoMaquina(){
         int i = gtTipoMaquina.cadastrarTipoMaquina();
    }
    
    public void alterarTipoMaquina(){
        int i = gtTipoMaquina.alterarTipoMaquina();
    }
    
    public void consultarTipoMaquina(){
        int i = gtTipoMaquina.consultarTipoMaquina();
    }
    
    public void excluirTipoMaquina(){
        int i = gtTipoMaquina.excluirTipoMaquina();
    }
}
