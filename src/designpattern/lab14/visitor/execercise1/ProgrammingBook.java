package designpattern.lab14.visitor.execercise1;

public abstract class ProgrammingBook extends Book{
    public ProgrammingBook(double price) {
        super(price);
    }

    public abstract String getResource();
}
