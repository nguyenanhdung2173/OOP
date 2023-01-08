package oop.lab6.animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void greets() {}

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder("Animal[name = ")
                .append(this.name)
                .append("]");
        return des.toString();
    }
}
