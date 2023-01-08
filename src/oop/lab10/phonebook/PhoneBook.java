package oop.lab10.phonebook;

public interface PhoneBook {
    Student searchByLastName(String lastName);
    Student searchByNumber(String phone);
    void addPerson(Student student);
    Student searchByName(String name);
    void deleteByNumber(String phone);
}
