package tech.jamersondev.factory.model;

import tech.jamersondev.factory.interfaces.IPrice;
import tech.jamersondev.factory.priceCountry.BrasilPrice;
import tech.jamersondev.factory.rules.RulesByCountryFactory;

public class BrasilXiaomiSmartphone implements RulesByCountryFactory {

    @Override
    public IPrice getPrice() {
        return new BrasilPrice();
    }
}
