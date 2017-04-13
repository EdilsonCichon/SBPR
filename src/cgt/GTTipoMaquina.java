package cgt;

import cdp.TipoMaquina;
import cgd.GDTipoMaquina;
import javax.swing.JOptionPane;

public class GTTipoMaquina {
    
    private GDTipoMaquina gdTipoMaquina;
    private TipoMaquina tipoMaquina;

    public GTTipoMaquina() {
        gdTipoMaquina = new GDTipoMaquina();
    }
    
    public void cadastrarTipoMaquina(String nome, String descricao) throws Exception {
        validarCampos(nome, descricao);
        tipoMaquina = new TipoMaquina(nome, descricao);
        gdTipoMaquina.cadastrar(tipoMaquina);
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
        // MELHORAR ESSA VALIDAÇÃO, FOI FEITA SOMENTE PARA COMEÇAR.
        if (nome.equals("") || descricao.equals(""))
            throw new Exception("Favor preencher os campos!");
    }
}
