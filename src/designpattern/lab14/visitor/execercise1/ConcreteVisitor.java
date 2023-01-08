package designpattern.lab14.visitor.execercise1;

public class ConcreteVisitor implements Visitor{
    private double totalPrice;

    public ConcreteVisitor() {
        totalPrice = 0.0;
    }

    @Override
    public void visit(BussinesBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getFavouriteBook());
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }
}
