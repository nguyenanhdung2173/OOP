package oop.lab6.line;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int xBegin, int yBegin, int xEnd, int yEnd) {
        begin = new Point(xBegin, yBegin);
        end = new Point(xEnd, yEnd);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return  end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return Math.atan2(xDiff, yDiff);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
