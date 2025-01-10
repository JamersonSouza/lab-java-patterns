package tech.jamersondev;

import tech.jamersondev.strategy.enums.PaymentTypeEnum;
import tech.jamersondev.strategy.services.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentTypeEnum.valueOf("PIX").pay(new PaymentService(),2.0);
    }
}