package designpattern.lab13.iterator.excercise1;

public class ProductIterator implements Iterator{
    private String[] productCatalog;
    private int length;
    private int position = 0;

    public ProductIterator(String[] productCatalog, int length) {
        this.productCatalog = productCatalog;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return position <= length;
    }

    @Override
    public Object Next() {
        String currentProduct = productCatalog[position++];
        return currentProduct;
    }

    @Override
    public void remove() {
        if (position > length) {
            return;
        }

        for (int i = position; i <= length; i++) {
            productCatalog[i] = productCatalog[i + 1];
        }
        length--;
    }
}
