package cci;

import cci.util.Constante;
import javax.swing.JFrame;
import cih.JPCrud;
import cih.JPServico;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class CIInterface{
    
    private CIGeral ciGeral;
    private CIFuncionario ciFuncionario;
    private CIMaquina ciMaquina;
    private CIProdutor ciProdutor;
    private CIPropriedade ciPropriedade;
    private CIServico ciServico;
    private CITipoMaquina ciTipoMaquina;
    private CITipoServico ciTipoServico;

    public CIInterface() {
        ciGeral = new CIGeral(this);
        ciFuncionario = new CIFuncionario(this);
        ciMaquina = new CIMaquina(this);
        ciProdutor = new CIProdutor(this);
        ciPropriedade = new CIPropriedade(this);
        ciServico = new CIServico(this);
        ciTipoMaquina = new CITipoMaquina(this);
        ciTipoServico = new CITipoServico(this);
        ciGeral.iniciarSistema();
    }
    
    public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }   
        }catch(Exception e){}
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIInterface();
            }   
        });
    }
    
    public void identificarInicio(JFrame pai, int codInicio, int codCrud) {

        switch (codInicio) {

            case Constante.SERVICO: ciServico.gerenciarServico(codCrud, pai); break;
            case Constante.PRODUTOR: ciProdutor.gerenciarProdutor(codCrud, pai); break;
            case Constante.PROPRIEDADE: ciPropriedade.gerenciarPropriedade(codCrud, pai); break;
            case Constante.MAQUINA: ciMaquina.gerenciarMaquina(codCrud, pai); break;
            case Constante.FUNCIONARIO: ciFuncionario.gerenciarFuncionario(codCrud, pai); break;
            case Constante.TIPO_SERVICO: ciTipoServico.gerenciarTipoServico(codCrud, pai); break;
            case Constante.TIPO_MAQUINA: ciTipoMaquina.gerenciarTipoMaquina(codCrud, pai); break;
            default: break;
        }
    }
    
    public ImageIcon setarIconesJanela(){  
        ImageIcon icone = new ImageIcon("build/classes/cih/icones/icone-janela.jpg");
        return icone;
    }
    
     public void iniciarCrud(int codInicio, JPCrud crud) {
        switch (codInicio) {
            case Constante.PRODUTOR: setarAtributosCrud(crud, "Produtores", "produtor"); break;
            case Constante.PROPRIEDADE: setarAtributosCrud(crud, "Propriedades", "propriedade"); break;
            case Constante.MAQUINA: setarAtributosCrud(crud, "Máquinas", "maquina"); break;
            case Constante.FUNCIONARIO: setarAtributosCrud(crud, "Funcionários", "funcionario"); break;
            case Constante.TIPO_SERVICO: setarAtributosCrud(crud, "Tipos de Serviços", "tipo-servico"); break;
            case Constante.TIPO_MAQUINA: setarAtributosCrud(crud, "Tipos de Máquinas", "tipo-maquina"); break;
            default: break;
        }
    }
     
     public void iniciarServico(JPServico serv){   
         setarAtributosServico(serv, "Serviços", "servico");  
     }
    
    public void setarAtributosCrud(JPCrud crud, String titulo, String tipo) {
        crud.setIconCadastrar(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-cadastrar-reduzido.png"));
        crud.setIconAlterar(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-alterar-reduzido.png"));
        crud.setIconConsultar(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-consultar-reduzido.png"));
        crud.setIconExcluir(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-excluir-reduzido.png"));
        crud.setBorder(BorderFactory.createTitledBorder("Gerenciar " +titulo));
    }
    
    public void setarAtributosServico(JPServico serv, String titulo, String tipo) {
        serv.setIconAgendar(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-cadastrar-reduzido.png"));
        serv.setIconAlterar(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-alterar-reduzido.png"));
        serv.setIconConsultar(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-consultar-reduzido.png"));
        serv.setIconConcluir(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-concluir-reduzido.png"));
        serv.setIconCancelar(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-excluir-reduzido.png"));
        serv.setBorder(BorderFactory.createTitledBorder("Gerenciar " +titulo));
    }

    public CIGeral getCiGeral() {
        return ciGeral;
    }

    public CIFuncionario getCiFuncionario() {
        return ciFuncionario;
    }

    public CIMaquina getCiMaquina() {
        return ciMaquina;
    }

    public CIProdutor getCiProdutor() {
        return ciProdutor;
    }

    public CIPropriedade getCiPropriedade() {
        return ciPropriedade;
    }

    public CIServico getCiServico() {
        return ciServico;
    }

    public CITipoMaquina getCiTipoMaquina() {
        return ciTipoMaquina;
    }

    public CITipoServico getCiTipoServico() {
        return ciTipoServico;
    }
}
