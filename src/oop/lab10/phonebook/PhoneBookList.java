package oop.lab10.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }


    @Override
    public Student searchByLastName(String lastName) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).lastName.equals(lastName)) {
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).phone.equals(phone)) {
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.add(student);
    }

    @Override
    public Student searchByName(String name) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).name.equals(name)) {
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
