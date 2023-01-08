package designpattern.lab14.visitor.execercise1;

public class JavaCoreBook extends ProgrammingBook {
    private String resource;
    private String favouriteBook;

    public JavaCoreBook(double price, String resource, String favouriteBook) {
        super(price);
        this.favouriteBook = favouriteBook;
        this.resource = resource;
    }

    @Override
    public String getResource() {
        return this.resource;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFavouriteBook() {
        return this.favouriteBook;
    }
}
