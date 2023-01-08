package designpattern.lab11.strategy.excercise2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PayByPaypal implements PayStrategy{
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private ReaderSingleton reader = ReaderSingleton.getInstance();
    private String email;
    private String password;
    private boolean singedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "join@amazon.eu");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (singedIn) {
            System.out.println("Paying  " + paymentAmount + " Using paypal.");
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!singedIn) {
                System.out.println("Enter the user's email: ");
                email = reader.getLine();
                System.out.println("Enter the password: ");
                password = reader.getLine();
                if (verify()) {
                    System.out.println("Data verification has been successful");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify() {
        setSingedIn(email.equals(DATA_BASE.get(password)));
        return singedIn;
    }


    public void setSingedIn(boolean singedIn) {
        this.singedIn = singedIn;
    }
}
