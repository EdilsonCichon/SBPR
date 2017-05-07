package cgt;

import cgd.Config;
import cgt.util.EnvioEmail;
import javax.mail.MessagingException;


public class GTGeral {
    
    private Config config;

    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        new EnvioEmail(emailDestinatario, mensagem, telefone);
    }
    
    public void inciarBancoDeDados(){ 
         config = new Config();       
    }
    
    public boolean validarAcesso(String usuario, String senha){
        return true;
    }
}
