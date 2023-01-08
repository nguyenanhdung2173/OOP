package oop.lab6.animal;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Mammal cat = new Cat("mimi");
        Mammal dog1 = new Dog("jack");
        Mammal dog2 = new Dog("foden");
        animals.add(cat);
        animals.add(dog1);

        for (Animal animal: animals) {
            animal.greets();
        }

        Dog dog3 = (Dog) dog1;
        Dog dog4 = (Dog) dog2;
        dog3.greets(dog4);
    }
}
