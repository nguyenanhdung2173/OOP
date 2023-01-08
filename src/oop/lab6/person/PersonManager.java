package oop.lab6.person;

public class PersonManager {
    private int capacity;
    private Person[] persons;
    private int size;

    public PersonManager() {
        capacity = 100;
        persons = new Person[capacity];
        size = 0;
    }

    public PersonManager(int capacity) {
        this.capacity = capacity;
        persons = new Person[capacity];
        size = 0;
    }

    public void addPerson(Person person) {
        persons[size++] = person;
    }

    public Person removePerson() {
        return persons[size--];
    }

    public void printPerson() {
        for (int i = 0; i < size; i++) {
            System.out.println(persons[i]);
        }
    }

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        Student student = new Student("nam", "HD", "DS", 2, 100.0);
        personManager.addPerson(student);
        Staff staff = new Staff("quan", "NA", "HUS", 2000.0);
        personManager.addPerson(staff);
        Staff staff2 = new Staff("nghia", "NA", "HUS", 1234.0);
        personManager.addPerson(staff2);
        personManager.printPerson();

        System.out.println("after: ");
        personManager.removePerson();
        personManager.printPerson();
    }
}
