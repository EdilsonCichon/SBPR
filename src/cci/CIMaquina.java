package cci;

import cci.util.Constante;
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
        if (codCrud == Constante.CADASTRAR) {
            cadastroMaquina = new JDCadastroMaquina(pai, true, ciInterface);
            cadastroMaquina.setVisible(true);
        } else if (codCrud == Constante.ALTERAR) {
            pesquisaMaquina = new JDPesquisarMaquina(pai, true, ciInterface);
            pesquisaMaquina.setVisible(true);
        }else if (codCrud == Constante.CONSULTAR) {
            pesquisaMaquina = new JDPesquisarMaquina(pai, true, ciInterface);
            pesquisaMaquina.setVisible(true);
        }else if (codCrud == Constante.EXCLUIR) {
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
