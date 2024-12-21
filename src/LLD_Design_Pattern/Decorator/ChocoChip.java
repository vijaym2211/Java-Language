package LLD_Design_Pattern.Decorator;

public class ChocoChip extends IngredientDecorator{

    public ChocoChip(Ingredient baseingredient){
        super(baseingredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription() + " ChocoChip";
    }
}
