package designpattern.lab11.singleton.excercise2;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
