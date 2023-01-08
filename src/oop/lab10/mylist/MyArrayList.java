package oop.lab10.mylist;

public class MyArrayList extends MyAbstractList{
    static final int INTIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INTIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o, int index) {
        if (size >= elements.length - 1) {
            enlarge();
        }

        if (index > size) {
            add(o);
        } else {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = o;
            size++;
        }
    }

    @Override
    public void remove(int index) {
        if (index > size) {
            elements[size--] = null;
        } else {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size--] = null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public void add(Object o) {
        if (size > elements.length - 1) {
            enlarge();
        }

        elements[size++] = o;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements,0, tmp, 0, elements.length);

        this.elements = tmp;
    }
}
