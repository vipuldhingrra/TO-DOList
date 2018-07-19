/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vipul Dhingra
 */
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class SendEmail {
     

public void send2() {

    
    
    

    final String username = "youremail"; 
    final String password = "yourpassword";

    Properties props = new Properties();
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }                            
});

    try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("youremail"));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(EmailPage.EmailID));
        message.setSubject("TO-DO List");    
        message.setText(EmailPage.MessageList);
        

       
        System.out.println("sending");
        Transport.send(message);
        JOptionPane.showMessageDialog(null, "Sent");
        
   

            
}catch (MessagingException e) {
        e.printStackTrace();
    }
  }



 
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
}

    