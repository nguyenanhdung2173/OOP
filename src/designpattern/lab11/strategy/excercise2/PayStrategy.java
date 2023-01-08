package designpattern.lab11.strategy.excercise2;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
