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

    public void builderDrink() {};

    public void builderFrenchFries(){};

    public void builderBurgers(){};

    public void builderDesserts(){};

    public void builderBreakfast(){};

    public void builderGift(){};

}
