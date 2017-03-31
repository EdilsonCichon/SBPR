package services;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class EnvioEmail {

    private static String USER_NAME = "tresmosqueteiros.ifes";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "tresmosqueteiros.ifes#2016"; // GMail password
    //private static String RECIPIENT = "edilsoncichon@gmail.com";

    public EnvioEmail(String toForm, String bodyForm, String telefone) throws AddressException, MessagingException {
        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = { toForm }; // list of recipient email addresses
        String subject = "SBPR - Suporte";
        String body = bodyForm;

        this.sendFromGMail(from, pass, to, subject, body + " - " + telefone);
    }

    private void sendFromGMail(String from, String pass, String[] to, String subject, String body) throws AddressException, MessagingException {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            throw ae;
        }
        catch (MessagingException me) {
            throw me;
        }
    }
}
