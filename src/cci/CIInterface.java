package cci;

import cih.principal.JPCrud;
import cih.principal.JPServico;
import cci.util.Modulo;
import javax.swing.JFrame;
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
    
    public void identificarModulo(JFrame pai, int MODULO, int CENARIO) {

        switch (MODULO) {

            case Modulo.SERVICO: ciServico.gerenciarServico(CENARIO, pai); break;
            case Modulo.PRODUTOR: ciProdutor.gerenciarProdutor(CENARIO, pai); break;
            case Modulo.PROPRIEDADE: ciPropriedade.gerenciarPropriedade(CENARIO, pai); break;
            case Modulo.MAQUINA: ciMaquina.gerenciarMaquina(CENARIO, pai); break;
            case Modulo.FUNCIONARIO: ciFuncionario.gerenciarFuncionario(CENARIO, pai); break;
            case Modulo.TIPO_SERVICO: ciTipoServico.gerenciarTipoServico(CENARIO, pai); break;
            case Modulo.TIPO_MAQUINA: ciTipoMaquina.gerenciarTipoMaquina(CENARIO, pai); break;
            default: break;
        }
    }
    
    public ImageIcon setarIconesJanela(){  
        ImageIcon icone = new ImageIcon("build/classes/cih/icones/icone-janela.jpg");
        return icone;
    }
    
     public void iniciarCrud(int MODULO, JPCrud crud) {
        switch (MODULO) {
            case Modulo.PRODUTOR: setarAtributosCrud(crud, "Produtores", "produtor"); break;
            case Modulo.PROPRIEDADE: setarAtributosCrud(crud, "Propriedades", "propriedade"); break;
            case Modulo.MAQUINA: setarAtributosCrud(crud, "Máquinas", "maquina"); break;
            case Modulo.FUNCIONARIO: setarAtributosCrud(crud, "Funcionários", "funcionario"); break;
            case Modulo.TIPO_SERVICO: setarAtributosCrud(crud, "Tipos de Serviços", "tipo-servico"); break;
            case Modulo.TIPO_MAQUINA: setarAtributosCrud(crud, "Tipos de Máquinas", "tipo-maquina"); break;
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
