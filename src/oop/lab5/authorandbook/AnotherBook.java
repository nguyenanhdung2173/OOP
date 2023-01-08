package oop.lab5.authorandbook;

public class AnotherBook {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public AnotherBook(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public AnotherBook(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
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

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Book[isbn = ")
                .append(this.isbn)
                .append(", name = ")
                .append(this.name)
                .append(", ")
                .append(author.toString())
                .append(", price = ")
                .append(this.price)
                .append(", qty = ")
                .append(this.qty)
                .append("]");
        return description.toString();
    }
}
