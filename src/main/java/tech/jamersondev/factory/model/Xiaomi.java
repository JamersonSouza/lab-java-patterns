package tech.jamersondev.factory.model;

import tech.jamersondev.factory.rules.RulesByCountryFactory;

public abstract class Xiaomi {
    RulesByCountryFactory rules;

    public Xiaomi(RulesByCountryFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();
    
    public void priceXiaomiByCountry(){
        System.out.println(rules.getPrice());
    }
}
