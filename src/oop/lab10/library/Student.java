package oop.lab10.library;

import java.util.Objects;

public class Student implements Comparable<Student>{
    String name;
    String lastName;
    String phone;
    double average;

    public Student(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = 0.0;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
        this.phone = "";
    }

    public Student(String name, String lastName, String phone, double average) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student o) {

        return -1;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        return Double.compare(student.average, average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, phone, average);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", average=" + average +
                ']';
    }
}
