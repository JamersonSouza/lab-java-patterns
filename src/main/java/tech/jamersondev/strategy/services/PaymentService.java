package tech.jamersondev.strategy.services;

import tech.jamersondev.strategy.interfaces.IPaymentMethods;

public class PaymentService implements IPaymentMethods {

    @Override
    public void debit_cart(double amount) {
        System.out.printf("Paid R$ %s with debit cart", amount);
    }

    @Override
    public void pix(double amount) {
        System.out.printf("Paid R$ %s with pix", amount);
    }

    @Override
    public void boleto(double amount) {
        System.out.printf("Paid R$ %s with boleto", amount);
    }



}
