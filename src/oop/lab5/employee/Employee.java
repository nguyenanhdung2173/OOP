package oop.lab5.employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return  firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        int raiseSalary = this.salary  + ((percent * salary) / 100);
        return raiseSalary;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Employee[id = ")
                .append(this.id)
                .append(", name = ")
                .append(this.getName())
                .append(", salary = ")
                .append(this.salary)
                .append("]");
        return  description.toString();
    }
}
