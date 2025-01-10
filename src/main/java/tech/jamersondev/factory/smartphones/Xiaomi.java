package tech.jamersondev.factory.smartphones;

import tech.jamersondev.factory.SmartphoneFactory;
import tech.jamersondev.factory.rules.RulesByCountryFactory;
import tech.jamersondev.factory.smartphones.modelos.RedmiNote12;

public class Xiaomi extends SmartphoneFactory {


    public Xiaomi(RulesByCountryFactory rules) {
        super(rules);
    }

    @Override
    protected tech.jamersondev.factory.model.Xiaomi create(String smartphone) {
        return "RedmiNote12".equals(smartphone) ? new RedmiNote12(rules) : null;
    }

}
