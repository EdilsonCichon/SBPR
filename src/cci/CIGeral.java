package cci;

import cdp.Cargo;
import cgt.GTGeral;
import javax.swing.JOptionPane;
import cih.principal.FrmPrincipal;
import cih.principal.FrmValidarAcesso;
import cih.principal.JDAjuda;
import cih.principal.JDCargo;
import cih.principal.JDEndereco;
import cih.principal.JDHabilitacao;
import cih.principal.JDRelatorio;
import cih.principal.JDSuporte;
import cih.principal.JPInicio;
import java.util.List;
import javax.mail.MessagingException;
import javax.swing.JFrame;

public class CIGeral {
    
    private GTGeral gtGeral;
    private CIInterface ciInterface;
    private FrmPrincipal frmPrincipal;
    private FrmValidarAcesso frmValidarAcesso;
    private JDAjuda ajuda;
    private JDRelatorio relatorio;
    private JPInicio inicio; 
    private JDSuporte suporte;
    private JDCargo cargo;
    private JDHabilitacao habilitacao;
    private JDEndereco endereco;

    public CIGeral(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        this.gtGeral = new GTGeral();
    }

    public void iniciarSistema() {
        gtGeral.inciarBancoDeDados();
        instanciarFrameValidarAcesso();
    }
    
    public boolean cadastrarCargo(String nomeCargo){
        try{
            gtGeral.cadastrarCargo(nomeCargo);
            JOptionPane.showMessageDialog(null, "Cargo Cadastrado!");
            return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
    
    public List<Cargo> consultarCargos(){
       return gtGeral.consultarCargos();
    }
    
    public void encerrarSessao() {
        
        int confirmacao = JOptionPane.showConfirmDialog(frmPrincipal, "Deseja Sair ?", "Sair", JOptionPane.YES_NO_OPTION);
            if ( confirmacao == 0 ){
                instanciarFrameValidarAcesso();
                frmPrincipal.dispose();   
            }        
    }
    
    public void validarAcesso(String usuario, String senha) {
 
        if(gtGeral.validarAcesso(usuario, senha)){
            instanciarFramePrincipal();
            frmValidarAcesso.dispose(); 
        }else{
            JOptionPane.showMessageDialog(frmValidarAcesso, "Acesso Negado");
        } 
    }
    
    public void instanciarFrameValidarAcesso(){
        frmValidarAcesso = new FrmValidarAcesso(ciInterface);
        frmValidarAcesso.setVisible(true);
    }
    
    public void instanciarFramePrincipal(){
        frmPrincipal = new FrmPrincipal(ciInterface);
        frmPrincipal.setVisible(true);
    }
    
    public JPInicio instanciarPainelInicio(FrmPrincipal pai){
        
        inicio = new JPInicio(pai, ciInterface); 
        return inicio;
    }
    
    public void instanciarTelaAjuda(JFrame pai){
        ajuda = new JDAjuda(pai, true, ciInterface);
        ajuda.setVisible(true);      
    }
    
    public void instanciarTelaRelatorio(JFrame pai){
        relatorio = new JDRelatorio(pai, true, ciInterface);
        relatorio.setVisible(true);
    }
    
    public void instanciarTelaSuporte(JFrame pai){
        suporte = new JDSuporte(pai, true, ciInterface);
        suporte.setVisible(true);  
    }
    
    public void instanciarTelaCadastroCargo(JFrame pai){
        cargo = new JDCargo(pai, true, ciInterface);
        cargo.setVisible(true);
    }
    
    public void instanciarTelaCadastroHabilitacao(JFrame pai){
        habilitacao = new JDHabilitacao(pai, true, ciInterface);
        habilitacao.setVisible(true);
    }
     
    public void instanciarTelaCadastroEndereco(JFrame pai){
        endereco = new JDEndereco(pai, true, ciInterface);
        endereco.setVisible(true);
    } 
    
    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        gtGeral.enviarEmail(emailDestinatario, mensagem, telefone);
    }
}
