package oop.lab5.customerandaccount;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append(customer.toString())
                .append(" balance = $")
                .append(this.balance);
        return description.toString();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance +=  amount;
        return this;
    }

    public Account withDraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount withdraw exceeds the current balance");
        }
        return this;
    }
}
