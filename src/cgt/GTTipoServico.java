package cgt;

import cci.SBPRException;
import cdp.Servico;
import cdp.TipoMaquina;
import cdp.TipoServico;
import cgd.GDServico;
import cgd.GDTipoServico;
import cgt.util.ValidaCampos;
import java.sql.SQLException;
import java.util.List;

public class GTTipoServico {
    
    private GDServico gdServico;
    private GDTipoServico gdTipoServico;
    private TipoServico tipoServico;

    public GTTipoServico() {
        gdTipoServico = new GDTipoServico();
        gdServico = new GDServico();
    }
    
    public void cadastrarTipoServico(String nome, String valor, String descricao, TipoMaquina tipoMaquina) throws SQLException, ClassNotFoundException, SBPRException{
        validarCampos(valor);
        tipoServico = new TipoServico(nome, descricao, Double.parseDouble(valor), tipoMaquina);
        gdTipoServico.cadastrar(tipoServico);  
    }
    
    public void alterarTipoServico(TipoServico tipoServico) throws SBPRException, SQLException, ClassNotFoundException{
        validarCampos(String.valueOf(tipoServico.getValor_hr()));
        gdTipoServico.alterar(tipoServico);
    }
    
    public List<TipoServico> consultarTipoServico(){
        return gdTipoServico.consultar(TipoServico.class);
    }
    
    public void excluirTipoServico(TipoServico tipoServico) throws SQLException, ClassNotFoundException, SBPRException {
        
        List servicos = gdServico.filtrar("tipoServico.id", tipoServico.getId(), Servico.class);
        if ( servicos.isEmpty() )
            gdTipoServico.excluir(tipoServico);
        else 
            throw new SBPRException(8);
        
    }
    
    private void validarCampos(String valor) throws SBPRException{
        if(!ValidaCampos.validarValor(valor))
            throw new SBPRException(7);   
    }
    
    public List<TipoServico> filtrarTipoServico(String colunaFiltro, String valorFiltro) {
        return gdTipoServico.filtrar(colunaFiltro, valorFiltro);
    }
}
