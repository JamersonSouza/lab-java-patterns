package tech.jamersondev.factory;

import tech.jamersondev.factory.model.Xiaomi;
import tech.jamersondev.factory.rules.RulesByCountryFactory;

public abstract class SmartphoneFactory {

    protected RulesByCountryFactory rules;

    public SmartphoneFactory(RulesByCountryFactory rules) {
        this.rules = rules;
    }

    public Xiaomi createSmartphone(String type){
        Xiaomi smartphone = create(type);
        smartphone.priceXiaomiByCountry();
        smartphone.getHardware();
        return smartphone;
    }

    protected abstract Xiaomi create(String smartphone);
}
