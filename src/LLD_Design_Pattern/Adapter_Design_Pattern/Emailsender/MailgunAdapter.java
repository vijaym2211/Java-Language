package LLD_Design_Pattern.Adapter_Design_Pattern.Emailsender;

public class MailgunAdapter implements EmailAdapter{

    Mailgun client = new Mailgun();


    @Override
    public void sendEmail(String to, String from, String content) {
        client.send(to, from, content, null, null);
    }
}