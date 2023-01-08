package designpattern.lab11.strategy.excercise1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        int action = (new Scanner(System.in).nextInt());
        if (action == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action == 2){
            context.setStrategy(new ConcreteStrategySubtract());
        } else {
            context.setStrategy(new ConcreteStrategyMultiply());
        }


        System.out.println(context.executeStrategy(2, 3));
        System.out.println(context.executeStrategy(4,6));
    }
}
