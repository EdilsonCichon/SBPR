package cci;

import cci.util.Cenario;
import cdp.Maquina;
import cdp.TipoMaquina;
import cgt.GTMaquina;
import javax.swing.JFrame;
import cih.maquina.JDCadastroMaquina;
import cih.maquina.JDPesquisarMaquina;
import java.awt.Frame;
import java.util.List;

public class CIMaquina {
    
    private CIInterface ciInterface;
    private GTMaquina gtMaquina;
    private JDCadastroMaquina cadastroMaquina;
    private JDPesquisarMaquina pesquisaMaquina;
    private Maquina maquinaSelecionada;

    public CIMaquina(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtMaquina = new GTMaquina();
    }
    
    public void gerenciarMaquina(int CENARIO, JFrame pai) {
        if (CENARIO == Cenario.CADASTRAR)
            instanciarTelaCadastroMaquina(null, pai, CENARIO);
        else
            instanciarTelaFiltroMaquina(pai, CENARIO);
    }
    
    public void instanciarTelaCadastroMaquina(Maquina maquina, Frame pai, int CENARIO){
        cadastroMaquina = new JDCadastroMaquina(pai, true, ciInterface, CENARIO, maquina);
        cadastroMaquina.setVisible(true);
    }
    
    public void instanciarTelaFiltroMaquina(Frame pai, int CENARIO) {
        pesquisaMaquina = new JDPesquisarMaquina(pai, true, ciInterface, CENARIO);
        pesquisaMaquina.setVisible(true);
    }

    public void cadastrarMaquina(String modelo, String placa, TipoMaquina tipoMaquina) throws Exception{
        try{  
            gtMaquina.cadastrarMaquina(modelo, placa, tipoMaquina);
        }catch(Exception e){
           throw e;   
        }
    }
    
    public void alterarMaquina(Maquina maquina, String modelo, String placa, TipoMaquina tipoMaquina) throws Exception{
        try{  
            gtMaquina.alterarMaquina(maquina, modelo, placa, tipoMaquina);
        }catch(Exception e){
            throw e;
        }
    }
    
    public List<Maquina> filtrarMaquina(String colunaFiltro, String filtro){
       return gtMaquina.filtrarMaquina(colunaFiltro, filtro);
    }
    
    public void excluirMaquina( Maquina maquina) throws Exception{
        try {
            gtMaquina.excluirMaquina(maquina);     
        } catch (Exception e) {
           throw e;  
        }
    }

    public Maquina getMaquinaSelecionada() {
        return maquinaSelecionada;
    }

    public void setMaquinaSelecionada(Maquina maquinaSelecionada) {
        this.maquinaSelecionada = maquinaSelecionada;
    }
}
