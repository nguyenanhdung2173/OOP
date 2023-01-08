package oop.lab10.mylist;

public class MyLinkedList extends MyAbstractList{
    private int size;
    private MyLinkedListNode head;

    public MyLinkedList() {
        size = 0;
        head = null;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        MyLinkedListNode nodeDelete = getNodeByIndex(index);
        MyLinkedListNode nodePrevious = getNodeByIndex(index - 1);
        nodePrevious.next = nodeDelete.next;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    public MyLinkedListNode getNodeByIndex(int index) {
        checkBoundaries(index, size);

        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current;
    }

    @Override
    public Object get(int index) {
        MyLinkedListNode node = getNodeByIndex(index);
        return node.payload;
    }

    @Override
    public void add(Object o) {
        head = new MyLinkedListNode(o, head);
        size++;
    }
}
