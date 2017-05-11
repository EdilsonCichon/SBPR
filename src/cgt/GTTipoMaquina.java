package cgt;

import cdp.TipoMaquina;
import cgd.GDTipoMaquina;

public class GTTipoMaquina {
    
    private GDTipoMaquina gdTipoMaquina;
    private TipoMaquina tipoMaquina;

    public GTTipoMaquina() {
        gdTipoMaquina = new GDTipoMaquina();
    }
    
    public TipoMaquina cadastrarTipoMaquina(String nome, String descricao) throws Exception {
        validarCampos(nome, descricao);
        tipoMaquina = new TipoMaquina(nome, descricao);
        gdTipoMaquina.cadastrar(tipoMaquina);
        return tipoMaquina;
    }
    
    public int alterarTipoMaquina() {
        gdTipoMaquina.alterar();
        return 0;
    }
    
    public int consultarTipoMaquina() {
        gdTipoMaquina.consultar();
        return 0;
    }
    
    public int excluirTipoMaquina() {
        gdTipoMaquina.excluir();
        return 0;
    } 
    
    private void validarCampos(String nome, String descricao) throws Exception {
        if (nome.equals("") || descricao.equals(""))
            throw new Exception("Verifique se todos os campos estão preenchidos!");
    }
}
