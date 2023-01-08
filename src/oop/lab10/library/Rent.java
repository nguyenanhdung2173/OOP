package oop.lab10.library;

import java.util.Date;

public class Rent {
    private Item item;
    private Date end;
    private Student student;
    private Date begin;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.end = end;
        this.student = student;
        this.begin = begin;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }


    @Override
    public String toString() {
        return "Rent[" +
                "item=" + item +
                ", end=" + end +
                ", student=" + student +
                ", begin=" + begin +
                ']';
    }
}
