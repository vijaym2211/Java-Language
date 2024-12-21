package LLD_Design_Pattern.Decorator;

public abstract class IngredientDecorator implements Ingredient{

    Ingredient baseIngredient;


    public IngredientDecorator(Ingredient baseingredient) {
        this.baseIngredient = baseingredient;
    }
}
