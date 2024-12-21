package LLD_Design_Pattern.Decorator;

public class MangoCone implements Ingredient{

    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "MangoCone";
    }
}
