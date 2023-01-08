package oop.lab8.comparable;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie left, Movie right) {
        double diff = left.getRating() - right.getRating();
        if (diff == 0.0) {
            return 0;
        } else if (diff < 0 ){
            return -1;
        } else {
            return 1;
        }
    }
}
