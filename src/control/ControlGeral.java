package control;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import windows.FrmPrincipal;
import windows.FrmValidarAcesso;
import windows.JPCrud;
import windows.JPServico;

/**
 *
 * @author Edilson
 */
public class ControlGeral {
    private ControlInterfaces controlInterfaces;
    private FrmValidarAcesso frmValidarAcesso;
    private FrmPrincipal frmPrincipal;

    public ControlGeral(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
    }

    public void iniciarSistema() {
         frmValidarAcesso = new FrmValidarAcesso(controlInterfaces);
         frmValidarAcesso.setVisible(true);
    }
    
    public void validarAcesso(String login, String senha) {
        if ( login.equals("") && senha.equals("") ) {
            if ( frmPrincipal == null )
                frmPrincipal = new FrmPrincipal(controlInterfaces);
            frmPrincipal.setVisible(true);
            frmValidarAcesso.dispose();
        } else {
            JOptionPane.showMessageDialog(frmValidarAcesso, "Acesso Negado");
        }
    }
    
    public void iniciarCrud(int codInicio, JPCrud crud) {
        switch (codInicio) {
            case 1: setarAtributosCrud(crud, "Produtores", "produtor"); break;
            case 2: setarAtributosCrud(crud, "Propriedades", "propriedade"); break;
            case 3: setarAtributosCrud(crud, "Máquinas", "maquina"); break;
            case 4: setarAtributosCrud(crud, "Funcionários", "funcionario"); break;
            case 5: setarAtributosCrud(crud, "Tipos de Serviço", "servico"); break;
            case 6: setarAtributosCrud(crud, "Tipos de Máquina", "maquina"); break;
            default: break;
        }
    }
    
    public void setarAtributosCrud(JPCrud crud, String titulo, String tipo) {
        crud.setIconCadastrar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-cadastrar-reduzido.png"));
        crud.setIconAlterar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-alterar-reduzido.png"));
        crud.setIconConsultar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-consultar-reduzido.png"));
        crud.setIconExcluir(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-excluir-reduzido.png"));
        crud.setBorder(BorderFactory.createTitledBorder("Gerenciar " +titulo));
    }
    
    public void setarAtributosServico(JPServico serv, String titulo, String tipo) {
        serv.setIconAgendar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-cadastrar-reduzido.png"));
        serv.setIconAlterar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-alterar-reduzido.png"));
        serv.setIconConsultar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-consultar-reduzido.png"));
        serv.setIconConcluir(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-concluido-reduzido.png"));
        serv.setIconCancelar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-excluir-reduzido.png"));
        serv.setBorder(BorderFactory.createTitledBorder("Gerenciar " +titulo));
    }
}
