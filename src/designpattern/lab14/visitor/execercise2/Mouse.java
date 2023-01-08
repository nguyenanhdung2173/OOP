package designpattern.lab14.visitor.execercise2;

public class Mouse implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
