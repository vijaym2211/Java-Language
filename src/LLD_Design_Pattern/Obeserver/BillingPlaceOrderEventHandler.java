package LLD_Design_Pattern.Obeserver;

public class BillingPlaceOrderEventHandler implements EventHandler{

    public BillingPlaceOrderEventHandler(){
        Publisher.getInstance().register(this);
    }

    @Override
    public void handler() {
        System.out.println("Creating bill");
    }
}
