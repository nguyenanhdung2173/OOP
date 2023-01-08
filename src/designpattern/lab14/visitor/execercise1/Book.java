package designpattern.lab14.visitor.execercise1;

public abstract class Book {
    protected double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void accept(Visitor v);
}
