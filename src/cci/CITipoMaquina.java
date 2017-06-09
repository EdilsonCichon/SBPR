package cci;

import cci.util.Cenario;
import cdp.TipoMaquina;
import cgt.GTTipoMaquina;
import cih.tipoMaquina.JDCadastroTipoMaquina;
import cih.tipoMaquina.JDPesquisarTipoMaquina;
import java.awt.Frame;
import java.util.List;
import javax.swing.JFrame;

public class CITipoMaquina {
    
    private CIInterface ciInterface;
    private GTTipoMaquina gtTipoMaquina;
    private JDCadastroTipoMaquina cadastroTipoMaquina;
    private JDPesquisarTipoMaquina pesquisaTipoMaquina;
    private TipoMaquina tipoMaquinaSelecionada;

    public CITipoMaquina(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtTipoMaquina = new GTTipoMaquina();
    }
    
    public void gerenciarTipoMaquina(int CENARIO, JFrame pai) {
        if ( CENARIO == Cenario.CADASTRAR )
            instanciarTelaCadastroTipoMaquina(null, pai, CENARIO);
        else
            instanciarTelaFiltroTipoMaquina(pai, CENARIO);
    }
        
    public void cadastrarTipoMaquina(String nome, String descricao) throws Exception {
        try {
            gtTipoMaquina.cadastrarTipoMaquina(nome, descricao); 
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void alterarTipoMaquina(TipoMaquina tipoMaquina, String nome, String descricao) throws Exception {
        try {
            gtTipoMaquina.alterarTipoMaquina(tipoMaquina, nome, descricao);    
        } catch (Exception e) {
            throw e;   
        }
    }
    
    public List<TipoMaquina> filtrarTipoMaquina(String colunaFiltro, String filtro){
       return gtTipoMaquina.filtrarTipoMaquina(colunaFiltro, filtro);
    }
    
    public List<TipoMaquina> consultarTipoMaquina(){
       return gtTipoMaquina.consultarTipoMaquina();
    }
    
    public void excluirTipoMaquina(TipoMaquina tipoMaquina){
        try {
            gtTipoMaquina.excluirTipoMaquina(tipoMaquina);
        } catch (Exception e) {     
        }  
    }
    
    public void instanciarTelaCadastroTipoMaquina(TipoMaquina tipoMaquina, Frame pai, int CENARIO) {
        cadastroTipoMaquina = new JDCadastroTipoMaquina(pai, true, CENARIO, ciInterface, tipoMaquina);
        cadastroTipoMaquina.setVisible(true);
    }
    
    public void instanciarTelaFiltroTipoMaquina(Frame pai, int CENARIO) {
        pesquisaTipoMaquina = new JDPesquisarTipoMaquina(pai, true, CENARIO, ciInterface);
        pesquisaTipoMaquina.setVisible(true);
    }

    public TipoMaquina getTipoMaquinaSelecionada() {
        return tipoMaquinaSelecionada;
    }

    public void setTipoMaquinaSelecionada(TipoMaquina tipoMaquinaSelecionada) {
        this.tipoMaquinaSelecionada = tipoMaquinaSelecionada;
    }
}
