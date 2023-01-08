package oop.lab7.anotheranimal;

public class BigDog extends Dog{
    @Override
    public void greeting() {
        System.out.println("woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("woooowww!");
    }
}
