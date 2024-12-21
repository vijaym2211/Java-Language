package LLD_Design_Pattern.Decorator;

import javax.print.attribute.standard.MediaName;

public class MangoScoop extends IngredientDecorator{

    public MangoScoop(Ingredient baseingredient){
        super(baseingredient);
    }
    @Override
    public double getCost() {
        return baseIngredient.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return  baseIngredient.getDescription() + " MangoScoop";
    }
}
