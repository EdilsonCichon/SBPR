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
import csw.WebServiceEmail;
import cgt.util.ValidaCampos;
import java.sql.SQLException;
import java.util.List;
import javax.mail.MessagingException;


public class GTGeral {
    
    private Config config;
    private GDGeral gdGeral;
    private GDEndereco gdEndereco;

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
            return 0;
           
        }else{
           
            Funcionario funcionario = gdGeral.identificarFuncionario(usuario.getId());
            if(funcionario == null){
                return 0;
            }else{
                if(funcionario.getCargo().getNome().equals("Gerente")){
                    return 1;
                }else if (funcionario.getCargo().getNome().equals("Atendente")){
                    return 2;
                }else{
                    return 0;
                }
            }    
        }
    }
    
     public Cep consultarCep(String cep){
        return gdEndereco.consultarCep(cep);
    }
}
