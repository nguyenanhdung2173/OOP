package oop.lab6.animal;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder("Cat[")
                .append(super.toString())
                .append("]");
        return des.toString();
    }
}
