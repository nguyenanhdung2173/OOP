package oop.lab10.mylist;

public abstract class MyAbstractList implements MyList{
    public MyAbstractList() {}

    public void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            des.append(String.format("[%s]", get(i).toString()));
        }
        return des.toString();
    }
}
