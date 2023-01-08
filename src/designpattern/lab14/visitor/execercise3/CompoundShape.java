package designpattern.lab14.visitor.execercise3;
import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape{
    public int id;
    public List<Shape> children;

    public CompoundShape(int id) {
        children = new ArrayList<>();
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
