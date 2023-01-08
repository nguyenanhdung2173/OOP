package designpattern.lab11.adapter.excercise1;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
