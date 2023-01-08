package oop.lab6.person;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder("Person[name = ")
                .append(this.name)
                .append(", address = ")
                .append(this.address)
                .append("]");
        return des.toString();
    }
}
