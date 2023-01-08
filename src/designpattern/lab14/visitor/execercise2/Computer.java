package designpattern.lab14.visitor.execercise2;

import java.util.LinkedList;
import java.util.List;

public class Computer implements ComputerPart{
    private ComputerPart[] parts;
    public Computer() {
        parts = new ComputerPart[]{new Keyboard(), new Mouse(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       for (ComputerPart computerPart : parts) {
           computerPart.accept(computerPartVisitor);
       }
       computerPartVisitor.visit(this);
    }
}
