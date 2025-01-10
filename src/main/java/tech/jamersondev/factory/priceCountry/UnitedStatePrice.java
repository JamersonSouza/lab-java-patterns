package tech.jamersondev.factory.priceCountry;

import tech.jamersondev.factory.interfaces.IPrice;

public class UnitedStatePrice implements IPrice {
    @Override
    public Double getPrice() {
        return 100.00;
    }

    @Override
    public String toString() {
        return "United State Price: " + this.getPrice();
    }
}
