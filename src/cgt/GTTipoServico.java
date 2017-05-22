package cgt;

import cci.SBPRException;
import cdp.TipoServico;
import cgd.GDTipoServico;
import cgt.util.ValidaCampos;
import java.sql.SQLException;
import java.util.List;

public class GTTipoServico {
    
    private GDTipoServico gdTipoServico;
    private TipoServico tipoServico;

    public GTTipoServico() {
        gdTipoServico = new GDTipoServico();
    }
    
    public void cadastrarTipoServico(String nome, String valor, String descricao) throws SQLException, ClassNotFoundException, SBPRException{
        validarCampos(valor);
        tipoServico = new TipoServico(nome, descricao, Double.parseDouble(valor), null);
        gdTipoServico.cadastrar(tipoServico);  
    }
    
    public void alterarTipoServico(TipoServico tipoServico) throws SBPRException, SQLException, ClassNotFoundException{
        validarCampos(String.valueOf(tipoServico.getValor_hr()));
        gdTipoServico.alterar(tipoServico);
    }
    
    public int consultarTipoServico(){
        //gdTipoServico.consultar();
        return 0;
    }
    
    public void excluirTipoServico(TipoServico tipoServico) throws SQLException, ClassNotFoundException {
        gdTipoServico.excluir(tipoServico);
    }
    
    private void validarCampos(String valor) throws SBPRException{
        if(!ValidaCampos.validarValor(valor))
            throw new SBPRException(1);   
    }
    
    public List<TipoServico> filtrarTipoServico(String colunaFiltro, String valorFiltro) {
        return gdTipoServico.filtrar(colunaFiltro, valorFiltro);
    }
}
