package LLD_Design_Pattern.Adapter_Design_Pattern.PhonePe_Banking;

public class ICICIApiAdapter implements BankAPI{

    ICICIBankAPI icici = new ICICIBankAPI();
    @Override
    public double getBalance(String accountNumber){
        return 0;
    }

    public boolean sendMoney(String fromAcc, String toAcc, double amount){
        System.out.println("ICICI API: Sending " + amount + " rs from " + fromAcc + " to " + toAcc);
        return true;
    }


}
