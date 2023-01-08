package designpattern.lab14.visitor.execercise1;

public interface Visitor {
    void visit(BussinesBook book);
    void visit(DesignPatternBook book);
    void visit(JavaCoreBook book);
}
