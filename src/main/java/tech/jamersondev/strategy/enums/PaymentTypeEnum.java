package tech.jamersondev.strategy.enums;

import tech.jamersondev.strategy.services.PaymentService;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public enum PaymentTypeEnum {

    DEBIT_CART(PaymentService::debit_cart), BOLETO(PaymentService::boleto), PIX(PaymentService::pix);

    private final BiConsumer<PaymentService, Double> payment;

    PaymentTypeEnum(BiConsumer<PaymentService, Double> payment) {
        this.payment = payment;
    }

    public void pay(PaymentService service, double amount) {
        payment.accept(service, amount);
    }
}
