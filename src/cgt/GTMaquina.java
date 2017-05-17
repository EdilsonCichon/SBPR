package cgt;

import cdp.Maquina;
import cdp.TipoMaquina;
import cgd.GDMaquina;
import java.sql.SQLException;

public class GTMaquina {
    
    private final GDMaquina gdMaquina;

    public GTMaquina() {
        gdMaquina = new GDMaquina();
    }
    
    public void cadastrarMaquina(String modelo, String placa, TipoMaquina tipoMaquina) throws SQLException, ClassNotFoundException{
        Maquina maquina = new Maquina(modelo, placa, tipoMaquina);
        gdMaquina.cadastrar(maquina);
        
    }
    
    public void alterarMaquina(Maquina maquina, String modelo, String placa, TipoMaquina tipoMaquina) throws SQLException, ClassNotFoundException{  
        maquina.setModelo(modelo);
        maquina.setPlaca(placa);
        maquina.setTipoMaquina(tipoMaquina);
        gdMaquina.alterar(maquina);
    }
    
    public int consultarMaquina(Maquina maquina){
        gdMaquina.consultar(maquina);
        return 0;
    }
    
    public int excluirMaquina(Maquina maquina) throws SQLException, ClassNotFoundException{
        gdMaquina.excluir(maquina);
        return 0;
    } 
}
