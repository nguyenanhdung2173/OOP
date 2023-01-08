package oop.lab7.anotheranimal;

public class Dog extends Animal{
    @Override
    public void greeting() {
        System.out.println("woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooof!");
    }
}
