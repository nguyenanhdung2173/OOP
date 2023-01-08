package designpattern.lab11.strategy.excercise2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static ReaderSingleton reader = ReaderSingleton.getInstance();
    private static Order order = new Order();


    static  {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
                while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 -  Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.getLine());
                cost = priceOnProducts.get(choice);
                System.out.println("Count: ");
                int count = Integer.parseInt(reader.getLine());
                order.setTotalCost(cost * count);
                System.out.println("Do you wish to continue selecting product? Y/N: ");
                continueChoice = reader.getLine();
            } while (continueChoice.equalsIgnoreCase("Y"));


            System.out.println("Please, select a payment method: " + "\n"
                    + "1 - Paypal" + "\n"
                    + "2 - Credit Card");
            String paymentMethod = reader.getLine();
            if (paymentMethod.equals("1")) {
                order.setPayMethod(new PayByPaypal());
                order.processOrder();
            } else {
                order.setPayMethod(new PayByCreditCard());
                order.processOrder();
            }


            System.out.println("Pay " + order.getTotalCost()
                    + " units or continue shopping? P/C: ");
            String proceed = reader.getLine();
            if (proceed.equalsIgnoreCase("P")) {
                if (order.getPayMethod().pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful");
                } else {
                    System.out.println("FAIL! please, check your data.");
                }
            }
            order.setClosed();
        }
    }
}
