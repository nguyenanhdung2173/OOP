package oop.lab6.animal;

public class AnimalManager {
    private int capacity;
    private Animal[] animals;
    private int size;

    public AnimalManager() {
        capacity = 100;
        animals = new Animal[capacity];
        size = 0;
    }

    public AnimalManager(int capacity) {
        this.capacity = capacity;
        animals = new Animal[capacity];
        size = 0;
    }

    public void addAnimal(Animal animal) {
        animals[size++] = animal;
    }

    public Dog[] fillterDog() {
        Dog[] dogs = new Dog[size];

        for (int i = 0; i < size; i++) {
            if (animals[i] instanceof Dog) {
                dogs[i] = (Dog) animals[i];
            }
        }
        return dogs;
    }

    public void printGreets() {
        for (int i = 0; i < size; i++) {
            animals[i].greets();
        }
    }

    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Dog dog = new Dog("jack");
        animalManager.addAnimal(dog);
        Cat cat = new Cat("mimi");
        animalManager.addAnimal(cat);

        animalManager.printGreets();
    }
}
