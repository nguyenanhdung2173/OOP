package oop.lab6.animal;

public class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("woooof");
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder("Dog[")
                .append(super.toString())
                .append("]");
        return des.toString();
    }
}
