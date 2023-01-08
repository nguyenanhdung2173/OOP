package designpattern.lab13.iterator.excercise1;

public class ProductCatalog implements Iterable{
    private String[] productCatalog;
    private final int SIZE = 10;
    private int length;

    public ProductCatalog() {
        this.productCatalog = new String[SIZE];
        length = -1;
    }

    public ProductCatalog add(String product) {
        if (length > this.productCatalog.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.productCatalog[length + 1] = product;
        this.length += 1;
        return this;
    }


    @Override
    public Iterator interator() {
        return new ProductIterator(productCatalog, length);
    }
}
