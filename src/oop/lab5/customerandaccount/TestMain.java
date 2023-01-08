package oop.lab5.customerandaccount;


public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "pham quang nam", 'm');
        Account account1 = new Account(1, customer1, 1000);
        System.out.println(customer1);
        System.out.println(account1);

        account1.deposit(100);
        System.out.println(account1);
        account1.withDraw(50);
        System.out.println(account1);
    }
}
