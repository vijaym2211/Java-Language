package LLD_Design_Pattern.Adapter_Design_Pattern.PhonePe_Banking;

public interface BankAPI {

    double getBalance(String accountNumber);

    boolean sendMoney(String fromAcc,
                      String toAcc,
                      double amount);

}
