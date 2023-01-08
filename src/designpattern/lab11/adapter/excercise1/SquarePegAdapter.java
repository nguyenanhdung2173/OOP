package designpattern.lab11.adapter.excercise1;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }

    public int getRadius() {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
