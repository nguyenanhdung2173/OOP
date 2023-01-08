package designpattern.lab11.strategy.excercise1;

public class Context {
    private Strategy strategy;

    public double executeStrategy(double a, double b) {
        return strategy.excute(a, b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
