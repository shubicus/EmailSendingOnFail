package mail.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class Email {

    public static void email() throws MessagingException {

        System.out.println(">>>Email start sending<<<");

        String to1 = "user1@gmail.com";
        String to2 = "user2@gmail.com";
        String to3 = "user3@gmail.com";
        final String from = "admin@gmail.com";
        final String password="password";

        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to1));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to2));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to3));
        message.setSubject("Hello");
        message.setText("What's up?");

        Transport.send(message);

        System.out.println(">>>Email was send<<<");
    }

}
