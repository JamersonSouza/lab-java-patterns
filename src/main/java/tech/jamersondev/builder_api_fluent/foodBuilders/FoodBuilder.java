package tech.jamersondev.builder_api_fluent.foodBuilders;

import tech.jamersondev.builder_api_fluent.model.Food;

public class FoodBuilder {

    private String burgers;
    private boolean frenchFries;
    private String drinks;
    private String desserts;
    private String breakfast;
    private String gift;

    public FoodBuilder(String burguer){
        this.burgers = burguer;
    }

    public FoodBuilder andDrink(String drink){
        this.drinks = drink;
        return this;
    }

    public FoodBuilder andFries(boolean fries){
        this.frenchFries = fries;
        return this;
    }

    public FoodBuilder andDesserts(String desserts){
        this.desserts = desserts;
        return this;
    }

    public Food finish(){
        return new Food(burgers, frenchFries,  drinks, desserts, breakfast, gift);
    }
}
