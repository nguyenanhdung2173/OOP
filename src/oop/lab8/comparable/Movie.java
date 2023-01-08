package oop.lab8.comparable;

public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(Movie other) {
        int diff = this.getYear() - other.getYear();
        if (diff == 0) {
            return 0;
        } else if (diff < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public Movie(String name, double rating , int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}
