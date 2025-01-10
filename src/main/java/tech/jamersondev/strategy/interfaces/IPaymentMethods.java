package tech.jamersondev.strategy.interfaces;

public interface IPaymentMethods {

    void debit_cart(double amount);
    void pix(double amount);
    void boleto(double amount);

}
