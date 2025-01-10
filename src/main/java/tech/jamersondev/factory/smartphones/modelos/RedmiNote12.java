package tech.jamersondev.factory.smartphones.modelos;

import tech.jamersondev.factory.model.Xiaomi;
import tech.jamersondev.factory.rules.RulesByCountryFactory;

public class RedmiNote12 extends Xiaomi {
    public RedmiNote12(RulesByCountryFactory rules) {
        super(rules);
    }
    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- CPU - SnapDragon");
        System.out.println("\t- 100MP + QVGA - CÂMERA");
        System.out.println("\t- 32Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
