package cgt;

import cdp.TipoMaquina;
import cgd.GDTipoMaquina;
import java.sql.SQLException;
import java.util.List;

public class GTTipoMaquina {
    
    private GDTipoMaquina gdTipoMaquina;
    private TipoMaquina tipoMaquina;

    public GTTipoMaquina() {
        gdTipoMaquina = new GDTipoMaquina();
    }
    
    public void cadastrarTipoMaquina(String nome, String descricao) throws Exception {
        tipoMaquina = new TipoMaquina(nome, descricao);
        gdTipoMaquina.cadastrar(tipoMaquina);
    }
    
    public void alterarTipoMaquina(TipoMaquina tipoMaquina, String nome, String descricao) throws SQLException, ClassNotFoundException {
       
        tipoMaquina.setDescricao(descricao);
        tipoMaquina.setNome(nome);
        gdTipoMaquina.alterar(tipoMaquina);
 
    }
    
    public List<TipoMaquina> consultarTipoMaquina() {
        return gdTipoMaquina.consultar();
    }
    
    public void excluirTipoMaquina(TipoMaquina tipoMaquina) throws SQLException, ClassNotFoundException {
        gdTipoMaquina.excluir(tipoMaquina);
    }
}
