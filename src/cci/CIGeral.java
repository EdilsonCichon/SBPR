package cci;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import cih.FrmPrincipal;
import cih.FrmValidarAcesso;
import cih.JDAjuda;
import cih.JDRelatorio;
import cih.JDSuporte;
import cih.JPCrud;
import cih.JPInicio;
import cih.JPServico;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CIGeral {
    
    private CIInterface ciInterface;
    private FrmValidarAcesso frmValidarAcesso;
    private FrmPrincipal frmPrincipal;
    private JDAjuda ajuda;
    private JDRelatorio relatorio;
    private JDSuporte suporte;
    private JPInicio inicio; 

    public CIGeral(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
    }
    
    public void trocarPanel(JPanel principal, JPanel jPanel) {
        principal.removeAll();
        principal.add(jPanel);
        principal.validate();
    }

    public void iniciarSistema() {
         frmValidarAcesso = new FrmValidarAcesso(ciInterface);
         frmValidarAcesso.setVisible(true);
    }
    
    public void encerrarSessao() {
        //JOptionPane.showConfirmDialog(null, "Deseja sair ?");
        frmValidarAcesso = new FrmValidarAcesso(ciInterface);
        frmValidarAcesso.setVisible(true);
        frmPrincipal.dispose();
    }
    
    public void validarAcesso(String login, String senha) {
        if ( login.equals("") && senha.equals("") ) {
            if ( frmPrincipal == null )
                frmPrincipal = new FrmPrincipal(ciInterface);
            frmPrincipal.setVisible(true);
            frmValidarAcesso.dispose();
        } else {
            JOptionPane.showMessageDialog(frmValidarAcesso, "Acesso Negado");
        }
    }
    
    public JPInicio abrirInicio(FrmPrincipal pai){
        
        inicio = new JPInicio(pai, ciInterface); 
        //JPanel principal = pai.getjPanelPrincipal();
        //trocarPanel(principal, inicio);
        return inicio;
    }
    
    public void abrirAjuda(JFrame pai){
        ajuda = new JDAjuda(pai, true);
        ajuda.setVisible(true);      
    }
    
    public void abrirRelatorio(JFrame pai){
        relatorio = new JDRelatorio(pai, true);
        relatorio.setVisible(true);
    }
    
    public void abrirSuporte(JFrame pai){
        suporte = new JDSuporte(pai, true);
        suporte.setVisible(true);  
    }
}
