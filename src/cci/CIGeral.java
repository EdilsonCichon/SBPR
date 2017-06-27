package cci;

import cci.util.Modulo;
import cgt.util.Permissao;
import cdp.Cargo;
import cdp.Funcionario;
import cdp.Habilitacao;
import cgt.GTGeral;
import cih.principal.FrmPrincipal;
import cih.principal.FrmValidarAcesso;
import cih.principal.JDAjuda;
import cih.principal.JDCargo;
import cih.principal.JDHabilitacao;
import cih.principal.JDRelatorio;
import cih.principal.JDSuporte;
import cih.principal.JPConfiguracoes;
import cih.principal.JPCrud;
import cih.principal.JPInicio;
import cih.principal.JPServico;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private JPCrud crud;
    private JPServico servico;
    private JPConfiguracoes config;
    private JDSuporte suporte;
    private JDCargo cargo;
    private JDHabilitacao habilitacao;
    private int permissao;
    private Funcionario funcionarioLogado;
    
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
            ciInterface.getCiMensagem().exibirMensagemSucesso(cargo, "Cargo Cadastrado!");
            return true;
        }catch (Exception e){
            ciInterface.getCiMensagem().exibirMensagemErro(cargo, e.getMessage());
            return false;
        }
    }
    
    public boolean cadastrarHabilitacao(String categoria){
        try{
            gtGeral.cadastrarHabilitacao(categoria);
            ciInterface.getCiMensagem().exibirMensagemSucesso(habilitacao, "Habilitação Cadastrada!");
            return true;
        }catch (Exception e){
            ciInterface.getCiMensagem().exibirMensagemErro(habilitacao, e.getMessage());
            return false;
        }
    }
    
    public List<Cargo> consultarCargos(){
       return gtGeral.consultarCargos();
    }
    
    public List<Habilitacao> consultarHabilitacoes(){
        return gtGeral.consultarHabilitacoes();
    }
    
    public void encerrarSessao() {

        int confirmacao = ciInterface.getCiMensagem().exibirMensagemConfirmacao(frmPrincipal, "Deseja Sair ?");
        if (confirmacao == 0) {
            instanciarFrameValidarAcesso();
            frmPrincipal.dispose();
        }
    }
    
    public void validarAcesso(String login, String senha) {
 
        int permissao = gtGeral.validarAcesso(login, senha);
        setPermissao(permissao);
        
        if(permissao == Permissao.PERMISSAO_NEGADA){
            ciInterface.getCiMensagem().exibirMensagemErro(ajuda, "Acesso Negado");
            
        }else{
            funcionarioLogado = gtGeral.getFuncionarioLogado();
            instanciarFramePrincipal();
            frmValidarAcesso.dispose(); 
        } 
    }
    
    public boolean identificarPermissaoJPCrud(int MODULO) {
        if (this.getPermissao() == Permissao.PERMISSAO_USER) {
            
            if (MODULO == Modulo.FUNCIONARIO){
                return false;
            }else{
                return true;
            }
        }else{
            return true;
        }
    }
    
    public boolean identificarPermissaoJPInicio(){
        if(this.getPermissao() == Permissao.PERMISSAO_USER){
            return false;
        }
        return true;
    }
    
    public void instanciarFrameValidarAcesso(){
        frmValidarAcesso = new FrmValidarAcesso(ciInterface);
        frmValidarAcesso.setVisible(true);
    }
    
    public void instanciarFramePrincipal(){
        frmPrincipal = new FrmPrincipal(ciInterface);
        frmPrincipal.setVisible(true);
    }
    
    public JPCrud instanciarJPCrud(JFrame pai , int MODULO){
        crud = new JPCrud(pai, MODULO, ciInterface);
        return crud;
    }
    
    public JPServico instanciarJPServico(JFrame pai , int MODULO){
        servico = new JPServico(pai, MODULO, ciInterface);
        return servico;
    }
    
    public JPConfiguracoes instanciarJPConfiguracoes(JFrame pai){
        config = new JPConfiguracoes(pai, ciInterface);
        return config;
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
    
    public void enviarEmail(String emailDestinatario, String mensagem, String telefone){
        try {
            gtGeral.enviarEmail(emailDestinatario, mensagem, telefone);
            ciInterface.getCiMensagem().exibirMensagemSucesso(suporte, "Email enviado! Aguarde nossa resposta.");
        } catch (MessagingException e) {
            ciInterface.getCiMensagem().exibirMensagemErro(servico, e.getMessage());
        }
    }  
    
    public int getPermissao() {
        return permissao;
    }
    
    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }
    
    public Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }
}
