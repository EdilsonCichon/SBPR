package cgt;

import cgt.util.SBPRException;
import cdp.Cargo;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.Usuario;
import cdp.endereco.Cep;
import cgd.Config;
import cgd.GDEndereco;
import cgd.GDGeral;
import cgt.util.Permissao;
import csw.WebServiceEmail;
import cgt.util.ValidaCampos;
import java.sql.SQLException;
import java.util.List;
import javax.mail.MessagingException;


public class GTGeral {
    
    private Config config;
    private GDGeral gdGeral;
    private GDEndereco gdEndereco;
    private Funcionario funcionarioLogado;

    public GTGeral() {
        gdGeral = new GDGeral();
        gdEndereco = new GDEndereco();
    }

    public void cadastrarCargo(String nomeCargo) throws SQLException, ClassNotFoundException, SBPRException{
        
        if(!ValidaCampos.validarNome(nomeCargo))
            throw new SBPRException(20);
        
        Cargo cargo = new Cargo(nomeCargo);
        gdGeral.cadastrar(cargo);
    }
    
    public void cadastrarHabilitacao(String categoria) throws SQLException, ClassNotFoundException, SBPRException{
        
        Habilitacao habilitacao = new Habilitacao(categoria);
        gdGeral.cadastrar(habilitacao);
    }
    
    public List<Cargo> consultarCargos(){
       return gdGeral.consultar(Cargo.class);
    }
    
    public List<Habilitacao> consultarHabilitacoes(){
       return gdGeral.consultar(Habilitacao.class);
    }
    
    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        new WebServiceEmail(emailDestinatario, mensagem, telefone);
    }
    
    public void inciarBancoDeDados(){ 
        config = new Config();
    }
    
    public int validarAcesso(String login, String senha){ 
       
        Usuario usuario = gdGeral.validarAcesso(login, senha);
        if(usuario == null){
            return Permissao.PERMISSAO_NEGADA;
           
        }else{
           
            Funcionario funcionario = gdGeral.identificarFuncionario(usuario.getId());
            if(funcionario == null){
                return Permissao.PERMISSAO_NEGADA;
            }else{
                setFuncionarioLogado(funcionario);
                if(funcionario.getCargo().getNome().equals("Gerente")){
                    return Permissao.PERMISSAO_ADMIN;
                }else if (funcionario.getCargo().getNome().equals("Atendente")){
                    return Permissao.PERMISSAO_USER;
                }else{
                    return Permissao.PERMISSAO_NEGADA;
                }
            }    
        }
    }

    public Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public void setFuncionarioLogado(Funcionario funcionarioLogado) {
        this.funcionarioLogado = funcionarioLogado;
    }
    
     public Cep consultarCep(String cep){
        return gdEndereco.consultarCep(cep);
    }
}
