package cci;

import cgt.GTMaquina;
import javax.swing.JFrame;
import cih.maquina.JDCadastroMaquina;
import cih.maquina.JDPesquisarMaquina;

public class CIMaquina {
    
    private CIInterface ciInterface;
    private GTMaquina gtMaquina;

    public CIMaquina(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtMaquina = new GTMaquina();
    }
    
    public void gerenciarMaquina(int codCrud, JFrame pai) {
        JDCadastroMaquina cadastroMaquina;
        JDPesquisarMaquina pesquisaMaquina; 
        if (codCrud == 0) {
            cadastroMaquina = new JDCadastroMaquina(pai, true, ciInterface);
            cadastroMaquina.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaMaquina = new JDPesquisarMaquina(pai, true, ciInterface);
            pesquisaMaquina.setVisible(true);
        }
    }

    public void cadastrarMaquina(){
        int i = gtMaquina.cadastrarMaquina();
    }
    
    public void alterarMaquina(){
        int i = gtMaquina.alterarMaquina();
    }
    
    public void consultarMaquina(){
        int i = gtMaquina.consultarMaquina();
    }
    
    public void excluirMaquina(){
        int i = gtMaquina.excluirMaquina();
    }    
}
