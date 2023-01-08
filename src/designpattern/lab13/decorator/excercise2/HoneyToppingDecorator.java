package designpattern.lab13.decorator.excercise2;

public class HoneyToppingDecorator extends ToppingDecorator{

    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String addTopping() {
        return " + cruncy honey";
    }

    @Override
    public String getDecripion() {
        return iceCream.getDecripion() + addTopping();
    }
}
