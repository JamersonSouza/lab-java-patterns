package tech.jamersondev.builder.foodBuilders;

import tech.jamersondev.builder.model.Food;

public abstract class FoodBuilder {
    protected Food food;

    public FoodBuilder() {
        food = new Food();
    }

    public Food getFood(){
        return food;
    }

    public abstract void builderDrink();

    public abstract void builderFrenchFries();

    public abstract void builderBurgers();

    public abstract void builderDesserts();

    public abstract void builderBreakfast();

    public abstract void builderGift();

}
