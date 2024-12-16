package LLD_Design_Pattern.Adapter_Design_Pattern.Emailsender;

public class Mailgun {

    public void send(String to, String from, String content, String[] cc, String[] bcc){
        System.out.println("Sending email via mailgun");
    }
}