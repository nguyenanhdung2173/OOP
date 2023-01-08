package oop.lab5.customerandinvoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCutomer() {
        return customer;
    }

    public void setCutomer(Customer cutomer) {
        this.customer = cutomer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDicount() {
        amount -= (getCustomerDiscount() * amount) / 100;
        return amount;
    }

    @Override
    public String toString() {
        StringBuilder disciption = new StringBuilder();
        disciption.append("Invoice[id = ")
                .append(this.id)
                .append(", ")
                .append("customer = ")
                .append(customer.toString())
                .append(", amount = ")
                .append(this.amount)
                .append("]");
        return disciption.toString();
    }
}
