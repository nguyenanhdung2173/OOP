package oop.lab6.animal;

public abstract class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder("Mammal[")
                .append(super.toString())
                .append("]");
        return des.toString();
    }

    @Override
    public void greets() {}
}
