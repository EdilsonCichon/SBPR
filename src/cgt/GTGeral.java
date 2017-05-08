package cgt;

import cgd.Config;
import cgd.GDValidaAcesso;
import cgt.util.EnvioEmail;
import javax.mail.MessagingException;


public class GTGeral {
    
    private Config config;
    private GDValidaAcesso gdValidarAcesso;

    public GTGeral() {
    }

    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        new EnvioEmail(emailDestinatario, mensagem, telefone);
    }
    
    public void inciarBancoDeDados(){ 
         config = new Config();       
    }
    
    public boolean validarAcesso(String usuario, String senha){
        
        gdValidarAcesso = new GDValidaAcesso();
        
       return gdValidarAcesso.validarAcesso(usuario, senha);
        
    }
}
