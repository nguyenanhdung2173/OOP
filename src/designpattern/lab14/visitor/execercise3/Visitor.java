package designpattern.lab14.visitor.execercise3;

public interface Visitor {
    String visit(Dot shape);
    String visit(Circle shape);
    String visit(Rectangle shape);
    String visit(CompoundShape shape);
}
