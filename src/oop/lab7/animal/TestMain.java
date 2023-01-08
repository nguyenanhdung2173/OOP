package oop.lab7.animal;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("nghia ngo");
        cat.greets();
        Dog dog = new Dog("Trong Quan");
        dog.greets();

        BigDog dog1 = new BigDog("nam");
        dog1.greets();
        dog1.greets(dog);
    }
}
