package tech.jamersondev.factory.priceCountry;

import tech.jamersondev.factory.interfaces.IPrice;

public class BrasilPrice implements IPrice {
    @Override
    public Double getPrice() {
        return 999.00;
    }

    @Override
    public String toString() {
        return "Brasil Price: " + this.getPrice();
    }
}
