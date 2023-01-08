package designpattern.lab14.visitor.execercise1;

public class DesignPatternBook extends ProgrammingBook {
    private String resource;
    private String bestSeller;

    public DesignPatternBook(double price, String resource, String bestSeller) {
        super(price);
        this.resource = resource;
        this.bestSeller = bestSeller;
    }

    @Override
    public String getResource() {
        return this.resource;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBestSeller() {
        return this.bestSeller;
    }
}
