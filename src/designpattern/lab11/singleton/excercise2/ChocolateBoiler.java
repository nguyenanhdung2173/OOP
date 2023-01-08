package designpattern.lab11.singleton.excercise2;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            instance = new ChocolateBoiler();
        }

        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled= false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isBoiled() && !isEmpty()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
