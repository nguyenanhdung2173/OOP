package oop.lab5.account;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance += amount;
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Account[id = ")
                .append(this.id)
                .append(", name = ")
                .append(this.name)
                .append(", balance = ")
                .append(this.balance)
                .append("]");
        return description.toString();
    }
}
