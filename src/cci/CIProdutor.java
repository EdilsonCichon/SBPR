package cci;

import cci.util.Crud;
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

        if (codCrud == Crud.CADASTRAR) {
            cadastroProdutor = new JDCadastroProdutor(pai, true, ciInterface);
            cadastroProdutor.setVisible(true);
        } else {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true, ciInterface, codCrud);
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
