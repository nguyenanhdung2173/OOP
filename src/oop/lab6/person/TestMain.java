package oop.lab6.person;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("nam", "HD", "undergraduate" ,2020, 1000.0));
        persons.add(new Staff("quan", "NA", "HUS", 1200.0));

        for (Person person : persons) {
            System.out.println(person);
        }

    }
}
