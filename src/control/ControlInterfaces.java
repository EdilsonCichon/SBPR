package control;

import javax.swing.JFrame;
import windows.JPCrud;
import windows.JPServico;

/**
 *
 * @author Chrysthian
 */
public class ControlInterfaces {
    
    private ControlGeral controlGeral;
    private ControlFuncionario controlFuncionario;
    private ControlMaquina controlMaquina;
    private ControlProdutor controlProdutor;
    private ControlPropriedade controlPropriedade;
    private ControlServico controlServico;
    private ControlTipoMaquina controlTipoMaquina;
    private ControlTipoServico controlTipoServico;

    public ControlInterfaces() {
        controlGeral = new ControlGeral(this);
        controlFuncionario = new ControlFuncionario(this);
        controlMaquina = new ControlMaquina(this);
        controlProdutor = new ControlProdutor(this);
        controlPropriedade = new ControlPropriedade(this);
        controlServico = new ControlServico(this);
        controlTipoMaquina = new ControlTipoMaquina(this);
        controlTipoServico = new ControlTipoServico(this);
        this.iniciarSistema();
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
                new ControlInterfaces();
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
        controlGeral.iniciarCrud(codInicio, crud);
    }
    
    public void setarAtributosServico(JPServico serv, String titulo, String tipo) {
        controlGeral.setarAtributosServico(serv, titulo, tipo);
    }
    
    public void iniciarSistema() {
        controlGeral.iniciarSistema();
    }
    
    public void encerrarSessao() {
        controlGeral.encerrarSessao();
    }
    public void validarAcesso(String login, String senha) {
        controlGeral.validarAcesso(login, senha);
    }
}
