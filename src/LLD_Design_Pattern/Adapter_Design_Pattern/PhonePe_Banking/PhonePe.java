package LLD_Design_Pattern.Adapter_Design_Pattern.PhonePe_Banking;

public class PhonePe {
    public static void main(String[] args) {
        BankAPI bankapi = new ICICIApiAdapter();

        String AccountNumber = "123456";
        String fromacc = "vijay123";
        String toacc = "Bhavik456";
        double amount = 90000;

        bankapi.sendMoney(fromacc, toacc, amount);

    }
}
