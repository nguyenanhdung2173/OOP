package designpattern.lab14.visitor.execercise3;

public class XMLExportVisitor implements Visitor{
    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Shape shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }

        return sb.toString();
    }

    @Override
    public String visit(Dot shape) {
        return "<dot>" + "\n" +
                "    <id>" + shape.getId() + "</id>" + "\n" +
                "    <x>" + shape.getX() + "</x>" + "\n" +
                "    <y>" + shape.getY() + "</y>" + "\n" +
                "</dot>";
    }

    @Override
    public String visit(Circle c) {
        return "<circle>" + "\n" +
                "    <id>" + c.getId() + "</id>" + "\n" +
                "    <x>" + c.getX() + "</x>" + "\n" +
                "    <y>" + c.getY() + "</y>" + "\n" +
                "    <radius>" + c.getRadius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visit(Rectangle r) {
        return "<rectangle>" + "\n" +
                "    <id>" + r.getId() + "</id>" + "\n" +
                "    <x>" + r.getX() + "</x>" + "\n" +
                "    <y>" + r.getY() + "</y>" + "\n" +
                "    <width>" + r.getWidth() + "</width>" + "\n" +
                "    <height>" + r.getHeight() + "</height>" + "\n" +
                "</rectangle>";
    }

    @Override
    public String visit(CompoundShape cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.getId() + "</id>" + "\n" +
                _visit(cg) +
                "</compound_graphic>";
    }

    public String _visit(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : cg.children) {
            String obj = shape.accept(this);
            obj = " " + obj.replace("\n", "\n   ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
}
