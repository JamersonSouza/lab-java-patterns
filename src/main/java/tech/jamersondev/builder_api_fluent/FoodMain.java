package tech.jamersondev.builder_api_fluent;

import tech.jamersondev.builder_api_fluent.foodBuilders.FoodBuilder;
import tech.jamersondev.builder_api_fluent.model.Food;

public class FoodMain {
    public static void main(String[] args) {
        Food food = new FoodBuilder("smash")
                .andFries(true)
                .andDrink("coca-cola")
                .andDesserts("ice cream")
                .finish();

        System.out.println(food);
    }
}
