package tech.jamersondev.factory.rules;

import tech.jamersondev.factory.interfaces.IPrice;
import tech.jamersondev.factory.priceCountry.BrasilPrice;

public class BrasilRulesFactorySmartphone implements RulesByCountryFactory{
    @Override
    public IPrice getPrice() {
        return new BrasilPrice();
    }
}
