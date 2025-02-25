package tech.jamersondev.builder;

import tech.jamersondev.builder.director.FoodDirector;
import tech.jamersondev.builder.foodBuilders.FoodBuilder;
import tech.jamersondev.builder.menu.MenuFood1;

public class FoodMain {
    public static void main(String[] args) {
        order("Combo menu 1: ", new MenuFood1());
    }

    public static void order(String name, FoodBuilder builder){
        System.out.println(String.format("Get Order: %s", name));
        FoodDirector foodDirector = new FoodDirector(builder);
        foodDirector.constructMenu1Food();
        System.out.println(foodDirector.getMenu1());

        System.out.println("=========================================");
    }
}
