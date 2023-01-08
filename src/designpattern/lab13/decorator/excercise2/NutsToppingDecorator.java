package designpattern.lab13.decorator.excercise2;

public class NutsToppingDecorator extends ToppingDecorator{

    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String addTopping() {
        return "+ cruncy nuts";
    }

    @Override
    public String getDecripion() {
        return iceCream.getDecripion() + addTopping();
    }
}
