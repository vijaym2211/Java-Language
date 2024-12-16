package LLD_Design_Pattern.Adapter_Design_Pattern.Emailsender;

public class SendgridAdapter implements EmailAdapter{

    Sendgrid client = new Sendgrid();


    @Override
    public void sendEmail(String to, String from, String content) {
        client.sendEmail(content, to, from, null, null);
    }
}