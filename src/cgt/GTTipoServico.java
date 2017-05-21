package cgt;

import cci.SBPRException;
import cdp.TipoServico;
import cgd.GDTipoServico;
import cgt.util.ValidaCampos;
import java.sql.SQLException;

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
    
    public int alterarTipoServico(){
        //gdTipoServico.alterar();
        return 0;
    }
    
    public int consultarTipoServico(){
        //gdTipoServico.consultar();
        return 0;
    }
    
    public int excluirTipoServico(){
        //gdTipoServico.excluir();
        return 0;
    } 
    
    private void validarCampos(String valor) throws SBPRException{
        if(!ValidaCampos.validarValor(valor))
            throw new SBPRException(1);   
    }
}
