package tech.jamersondev.builder.menu;

import tech.jamersondev.builder.foodBuilders.FoodBuilder;

public class MenuFood1 extends FoodBuilder {
    @Override
    public void builderDrink() {
        food.setDrinks("Coca-cola");
    }

    @Override
    public void builderFrenchFries() {
        food.setFrenchFries(true);
    }

    @Override
    public void builderBurgers() {
        food.setBurgers("Smash");
    }

    @Override
    public void builderDesserts() {
        food.setDesserts("Ice Cream");
    }

}
