package oop.lab6.line;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, endX);
        end = new Point(beginY, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = super.getX() - end.getX();
        int yDiff = super.getY() - end.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = super.getX() - end.getX();
        int yDiff = super.getY() - end.getY();
        return Math.atan2(xDiff, yDiff);
    }

    @Override
    public String toString() {
        return "LineSub{begin=" + super.toString() +
                "end=" + end +
                '}';
    }
}
