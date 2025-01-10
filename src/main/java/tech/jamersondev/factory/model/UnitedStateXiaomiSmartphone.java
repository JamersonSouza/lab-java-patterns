package tech.jamersondev.factory.model;

import tech.jamersondev.factory.interfaces.IPrice;
import tech.jamersondev.factory.priceCountry.UnitedStatePrice;
import tech.jamersondev.factory.rules.RulesByCountryFactory;

public class UnitedStateXiaomiSmartphone implements RulesByCountryFactory {

    @Override
    public IPrice getPrice() {
        return new UnitedStatePrice();
    }
}
