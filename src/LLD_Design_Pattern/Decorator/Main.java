package LLD_Design_Pattern.Decorator;

import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args) {

        Ingredient icecream = new StrawberrySyrup(
                                    new ChocoChip(
                                        new MangoScoop(
                                            new ChocoCone()
                                        )
                                    )
                            );

        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());


    }
}
