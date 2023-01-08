package oop.lab5.authorandbook;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Book[")
                .append("name = ")
                .append(this.name)
                .append(", ")
                .append(author.toString())
                .append(", price = ")
                .append(this.price)
                .append(", qty =")
                .append(this.qty)
                .append("]");
        return description.toString();
    }
}
