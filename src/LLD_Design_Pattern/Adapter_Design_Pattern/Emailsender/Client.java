package LLD_Design_Pattern.Adapter_Design_Pattern.Emailsender;

public class Client {

    public static void main(String[] args) {
        EmailHelper emailHelper = new EmailHelper(new SendgridAdapter());
        emailHelper.sendEmail("bhavik@scaler.com", "admin@scaler.com", "Hello!");
    }
}