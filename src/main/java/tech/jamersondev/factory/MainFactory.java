package tech.jamersondev.factory;

import tech.jamersondev.factory.rules.BrasilRulesFactorySmartphone;
import tech.jamersondev.factory.rules.RulesByCountryFactory;
import tech.jamersondev.factory.smartphones.Xiaomi;

public class MainFactory {
    public static void main(String[] args) {
        RulesByCountryFactory rules = new BrasilRulesFactorySmartphone();
        SmartphoneFactory factory = new Xiaomi(rules);
        factory.createSmartphone("RedmiNote12");
    }
}
