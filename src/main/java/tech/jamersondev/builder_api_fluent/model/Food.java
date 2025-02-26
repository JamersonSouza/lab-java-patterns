package tech.jamersondev.builder_api_fluent.model;

public class Food {

    private String burgers;
    private boolean frenchFries;
    private String drinks;
    private String desserts;
    private String breakfast;
    private String gift;

    public Food() {
    }

    public Food(String burgers, boolean frenchFries, String drinks, String desserts, String breakfast, String gift) {
        this.burgers = burgers;
        this.frenchFries = frenchFries;
        this.drinks = drinks;
        this.desserts = desserts;
        this.breakfast = breakfast;
        this.gift = gift;
    }

    public String getBurgers() {
        return burgers;
    }

    public void setBurgers(String burgers) {
        this.burgers = burgers;
    }

    public boolean isFrenchFries() {
        return frenchFries;
    }

    public void setFrenchFries(boolean frenchFries) {
        this.frenchFries = frenchFries;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getDesserts() {
        return desserts;
    }

    public void setDesserts(String desserts) {
        this.desserts = desserts;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "Food{" +
                "burgers='" + burgers + '\'' +
                ", frenchFries=" + frenchFries +
                ", drinks='" + drinks + '\'' +
                ", desserts='" + desserts + '\'' +
                ", breakfast='" + breakfast + '\'' +
                ", gift='" + gift + '\'' +
                '}';
    }
}
