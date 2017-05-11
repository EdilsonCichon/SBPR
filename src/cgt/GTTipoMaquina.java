package cgt;

import cdp.TipoMaquina;
import cgd.GDTipoMaquina;
import java.util.LinkedList;

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
    
    public TipoMaquina alterarTipoMaquina(String nome, String descricao) {
        TipoMaquina tipoMaquina = new TipoMaquina(nome, descricao);
        gdTipoMaquina.alterar(tipoMaquina);
        return tipoMaquina;
    }
    
    public LinkedList<TipoMaquina> consultarTipoMaquina(String nomePesquisado) {
        return gdTipoMaquina.consultar(nomePesquisado);
    }
    
    public int excluirTipoMaquina(TipoMaquina tipoMaquina) {
        gdTipoMaquina.excluir(tipoMaquina);
        return 0;
    }
    
    private void validarCampos(String nome, String descricao) throws Exception {
        if (nome.equals("") || descricao.equals(""))
            throw new Exception("Verifique se todos os campos estão preenchidos!");
    }
}
