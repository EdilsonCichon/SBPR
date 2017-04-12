package cci;

import javax.swing.JFrame;
import cih.JPCrud;
import cih.JPServico;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author Chrysthian
 */
public class ControlInterface{
    
    private ControlGeral controlGeral;
    private ControlFuncionario controlFuncionario;
    private ControlMaquina controlMaquina;
    private ControlProdutor controlProdutor;
    private ControlPropriedade controlPropriedade;
    private ControlServico controlServico;
    private ControlTipoMaquina controlTipoMaquina;
    private ControlTipoServico controlTipoServico;

    public ControlInterface() {
        controlGeral = new ControlGeral(this);
        controlFuncionario = new ControlFuncionario(this);
        controlMaquina = new ControlMaquina(this);
        controlProdutor = new ControlProdutor(this);
        controlPropriedade = new ControlPropriedade(this);
        controlServico = new ControlServico(this);
        controlTipoMaquina = new ControlTipoMaquina(this);
        controlTipoServico = new ControlTipoServico(this);
        controlGeral.iniciarSistema();
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
                new ControlInterface();
            }   
        });
    }
    
    public void identificarInicio(JFrame pai, int codInicio, int codCrud) {

        switch (codInicio) {

            case 0: controlServico.gerenciarServico(codCrud, pai); break;
            case 1: controlProdutor.gerenciarProdutor(codCrud, pai); break;
            case 2: controlPropriedade.gerenciarPropriedade(codCrud, pai); break;
            case 3: controlMaquina.gerenciarMaquina(codCrud, pai); break;
            case 4: controlFuncionario.gerenciarFuncionario(codCrud, pai); break;
            case 5: controlTipoServico.gerenciarTipoServico(codCrud, pai); break;
            case 6: controlTipoMaquina.gerenciarTipoMaquina(codCrud, pai); break;
            default: break;
        }
    }   
    
     public void iniciarCrud(int codInicio, JPCrud crud) {
        switch (codInicio) {
            case 1: setarAtributosCrud(crud, "Produtores", "produtor"); break;
            case 2: setarAtributosCrud(crud, "Propriedades", "propriedade"); break;
            case 3: setarAtributosCrud(crud, "Máquinas", "maquina"); break;
            case 4: setarAtributosCrud(crud, "Funcionários", "funcionario"); break;
            case 5: setarAtributosCrud(crud, "Tipos de Serviços", "servico"); break;
            case 6: setarAtributosCrud(crud, "Tipos de Máquinas", "maquina"); break;
            default: break;
        }
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
        serv.setIconConcluir(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-concluido-reduzido.png"));
        serv.setIconCancelar(new ImageIcon("build/classes/cih/icones/icone-" +tipo + "-excluir-reduzido.png"));
        serv.setBorder(BorderFactory.createTitledBorder("Gerenciar " +titulo));
    }

    public ControlGeral getControlGeral() {
        return controlGeral;
    }

    public ControlFuncionario getControlFuncionario() {
        return controlFuncionario;
    }

    public ControlMaquina getControlMaquina() {
        return controlMaquina;
    }

    public ControlProdutor getControlProdutor() {
        return controlProdutor;
    }

    public ControlPropriedade getControlPropriedade() {
        return controlPropriedade;
    }

    public ControlServico getControlServico() {
        return controlServico;
    }

    public ControlTipoMaquina getControlTipoMaquina() {
        return controlTipoMaquina;
    }

    public ControlTipoServico getControlTipoServico() {
        return controlTipoServico;
    }
}
