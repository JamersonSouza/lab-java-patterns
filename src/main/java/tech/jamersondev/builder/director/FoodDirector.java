package tech.jamersondev.builder.director;

import tech.jamersondev.builder.foodBuilders.FoodBuilder;
import tech.jamersondev.builder.model.Food;

public class FoodDirector {

    private FoodBuilder foodBuilder;

    public FoodDirector(FoodBuilder foodBuilder) {
        this.foodBuilder = foodBuilder;
    }

    public void constructMenu1Food(){
        foodBuilder.builderDrink();
        foodBuilder.builderFrenchFries();
        foodBuilder.builderBurgers();
        foodBuilder.builderDesserts();
    }

    public Food getMenu1(){
        return foodBuilder.getFood();
    }
}
