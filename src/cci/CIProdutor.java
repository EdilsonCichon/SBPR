package cci;

import cgt.GTProdutor;
import javax.swing.JFrame;
import cih.produtor.JDCadastroProdutor;
import cih.produtor.JDPesquisaProdutor;

public class CIProdutor {
    
    private CIInterface ciInterface;
    private GTProdutor gtProdutor;

    public CIProdutor(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtProdutor = new GTProdutor();
    }
    
    public void gerenciarProdutor(int codCrud, JFrame pai) {
        
        JDCadastroProdutor cadastroProdutor;
        JDPesquisaProdutor pesquisaProdutor;

        if (codCrud == 0) {
            cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface);
            cadastroProdutor.setVisible(true);
        } else if (codCrud == 1) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface);
            pesquisaProdutor.setVisible(true);
        } else if (codCrud == 2) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface);
            pesquisaProdutor.setVisible(true);
        } else if (codCrud == 3) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface);
            pesquisaProdutor.setVisible(true);
        }
    }
    
    public void cadastrarProdutor(){
        int i = gtProdutor.cadastrarProdutor();
    }
    
    public void alterarProdutor(){
       int i = gtProdutor.alterarProdutor();
    }
    
    public void consultarProdutor(){
       int i = gtProdutor.consultarProdutor();
    }
    
    public void excluirProdutor(){
       int i = gtProdutor.excluirProdutor();
    }
}
