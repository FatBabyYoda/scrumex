/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Lucas Andersson
 */
public class eSender {
    Session newSession = null;
  
    private MimeMessage mimeMessage;

    public static void sendComfirmation(String epostKonto) throws MessagingException
    {
         eSender mail = new eSender();
         mail.setupProperties();
         mail.draftEmail(epostKonto.toLowerCase());
         mail.send();
    }
    
    private void setupProperties() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable","true");
        
        newSession = Session.getDefaultInstance(properties,null);
                
    }

    private void send() throws NoSuchProviderException, MessagingException {
      String epost = "hattmakare2@gmail.com";
      String losen = "ldcm yvip ypdz rqeh";
      String host = "smtp.gmail.com";
      Transport transport = newSession.getTransport("smtp");
      transport.connect(host,epost,losen);
      transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
      transport.close();
    }

    private MimeMessage draftEmail(String epostKonto ) throws AddressException, MessagingException {
        
       String eSubject = "Bekräftelse på order";
       String eBody = "Tack för din beställningtesttttt";
       mimeMessage = new MimeMessage(newSession);
       mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(epostKonto));
       mimeMessage.setSubject(eSubject);
       MimeMultipart multiPart = new MimeMultipart();
       MimeBodyPart bodyPart = new MimeBodyPart();
       bodyPart.setContent(eBody,"text/html; charset=utf-8");
       multiPart.addBodyPart(bodyPart);
       mimeMessage.setContent(multiPart);
       return mimeMessage;
       
       
    }
public static void main(String[] args) throws MessagingException{
        sendComfirmation("gttgeded@gmail.com");
    }
}
