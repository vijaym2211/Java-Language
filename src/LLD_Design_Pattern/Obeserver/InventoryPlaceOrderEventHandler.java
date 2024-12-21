package LLD_Design_Pattern.Obeserver;

import java.security.spec.RSAOtherPrimeInfo;

public class InventoryPlaceOrderEventHandler implements EventHandler{

    public InventoryPlaceOrderEventHandler(){
        Publisher.getInstance().register(this);
    }

    public void handler(){
        System.out.println("Handling inventory");
    }
}
