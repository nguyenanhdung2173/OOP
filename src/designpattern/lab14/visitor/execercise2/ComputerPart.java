package designpattern.lab14.visitor.execercise2;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
