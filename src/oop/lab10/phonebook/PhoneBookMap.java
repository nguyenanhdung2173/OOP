package oop.lab10.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }


    @Override
    public Student searchByLastName(String lastName) {
        for (Student student : phoneBook.values()) {
            if (student.lastName.equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.phone.equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.put(student.phone, student);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
