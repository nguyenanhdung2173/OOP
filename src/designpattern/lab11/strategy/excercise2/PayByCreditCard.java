package designpattern.lab11.strategy.excercise2;

import java.io.IOException;

public class PayByCreditCard implements PayStrategy{
    private ReaderSingleton reader = ReaderSingleton.getInstance();
    private CreditCard card;

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    private boolean cardIsPresent() {
        return card != null;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card number: ");
            String number = reader.getLine();
            System.out.println("Enter the card expiration date 'mm/yy': ");
            String date = reader.getLine();
            System.out.println("Enter the CVV code: ");
            String cvv = reader.getLine();
            if (CreditCardValidator.isValid(number)) {
                card = new CreditCard(number, date, cvv);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
