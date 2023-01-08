package designpattern.lab11.strategy.excercise1;

public class ConcreteStrategyAdd implements Strategy{

    @Override
    public double excute(double a, double b) {
        return a + b;
    }
}
