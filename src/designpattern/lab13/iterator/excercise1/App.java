package designpattern.lab13.iterator.excercise1;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("Apple")
                .add("Banana")
                .add("Grapes")
                .add("Coconut")
                .add("Lemon")
                .add("Melon")
                .add("Orange");
        Iterator it = productCatalog.interator();
        while (it.hasNext()) {
            String product = (String) it.Next();
            if (product.equals("Orange")) {
                it.remove();
            } else{
                System.out.print(product + " ");
            }
        }



    }
}
