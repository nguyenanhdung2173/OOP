package oop.lab5.authorandbook;

public class BookAdvance {
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public BookAdvance(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

    public BookAdvance(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
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

    public String getAuthorNames() {
        StringBuilder description  = new StringBuilder();
        for (int i = 0; i < author.length; i++) {
            description.append(author[i].toString());
            description.append(",");
        }
        description.delete(description.length() - 1, description.length());

        return description.toString();
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Book[")
                .append("name = ")
                .append(this.name)
                .append(", author = {")
                .append(this.getAuthorNames())
                .append("}, price = ")
                .append(this.price)
                .append(", qty =")
                .append(this.qty)
                .append("]");
        return description.toString();
    }
}
