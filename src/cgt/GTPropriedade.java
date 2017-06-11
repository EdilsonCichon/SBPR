package cgt;

import cgt.util.SBPRException;
import cdp.Produtor;
import cdp.Propriedade;
import cdp.Servico;
import cgd.GDPropriedade;
import cgd.GDServico;
import java.sql.SQLException;
import java.util.List;

public class GTPropriedade {
    
    private GDPropriedade gdPropriedade;
    private GDServico gdServico;

    public GTPropriedade() {
        gdPropriedade = new GDPropriedade();
        gdServico = new GDServico();
    }
    
    public void cadastrarPropriedade(Produtor responsavel, String nome, String referencia) throws SQLException, ClassNotFoundException{
        Propriedade propriedade = new Propriedade(nome, referencia, responsavel);
        gdPropriedade.cadastrar(propriedade);
    }
    
    public Propriedade instanciarPropriedadeVazia(Produtor responsavel){
        
        Propriedade propriedade = new Propriedade("", "", responsavel);
        
        return propriedade;
    }
    
    public void alterarPropriedade(Propriedade propriedade, Produtor produtorSelecionado) throws SQLException, ClassNotFoundException {
        propriedade.setResponsavel(produtorSelecionado);
        gdPropriedade.alterar(propriedade);
    }
      
    public void excluirPropriedade(Propriedade propriedade) throws SQLException, ClassNotFoundException, SBPRException {
        List servicos = gdServico.filtrar("propriedade.id", propriedade.getId(), Servico.class);
        if ( servicos.isEmpty() )
            gdPropriedade.excluir(propriedade);
        else 
            throw new SBPRException(50);
    }
    
    public List<Propriedade> filtrarPropriedades(String colunaFiltro, String valorFiltro) {
        return gdPropriedade.filtrar(colunaFiltro, valorFiltro);
    }
}
