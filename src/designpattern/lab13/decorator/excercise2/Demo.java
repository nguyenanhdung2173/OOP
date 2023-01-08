package designpattern.lab13.decorator.excercise2;

public class Demo {
    public static void main(String[] args) {
        ToppingDecorator iceCream = new HoneyToppingDecorator(new NutsToppingDecorator(new StrawberryIceCream()));
        System.out.println(iceCream.getDecripion());
    }
}
