package designpattern.lab13.decorator.excercise2;

public abstract class ToppingDecorator implements IceCream{
    protected  IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public abstract String addTopping();

    @Override
    public String getDecripion() {
        return iceCream.getDecripion();
    }
}
