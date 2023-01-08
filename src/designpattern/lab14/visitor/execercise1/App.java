package designpattern.lab14.visitor.execercise1;

public class App {
    public static void main(String[] args) {
        ConcreteVisitor visitor = new ConcreteVisitor();

        Book businessBook = new BussinesBook(50.0, "DH Quoc Gia");
        businessBook.accept(visitor);
        System.out.println();

        Book designPatternBook = new DesignPatternBook(60.0, "store", "Head first design pattern");
        designPatternBook.accept(visitor);
        System.out.println();

        Book javaCoreBook = new JavaCoreBook(60.0, "Store", "Google");
        javaCoreBook.accept(visitor);
        System.out.println();

        System.out.println("total price : " + visitor.getTotalPrice());

    }
}
