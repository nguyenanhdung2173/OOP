package designpattern.lab11.adapter.excercise2;

public class TestDriver {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        testDuck(duck);

        Duck adapter = new TurkeyAdapter(turkey);
        testDuck(adapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
