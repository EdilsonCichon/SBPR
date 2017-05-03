package cgt;

import cgt.util.EnvioEmail;
import javax.mail.MessagingException;

public class GTGeral {

    public GTGeral() {
    }
    
    public void enviarEmail(String emailDestinatario, String mensagem, String telefone) throws MessagingException {
        new EnvioEmail(emailDestinatario, mensagem, telefone);
    }
    
    // Antes de adicionar um método aqui verifique se não faz parte de nenhum
    // módulo já existente.
}
