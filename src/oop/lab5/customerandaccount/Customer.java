package oop.lab5.customerandaccount;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder discription = new StringBuilder(this.name);
        discription.append("(")
                .append(this.id)
                .append(")");
        return discription.toString();
    }
}
