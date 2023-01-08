package oop.lab8.lists;

import java.util.*;
import java.util.NoSuchElementException;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        insertFirst(list, 3);
        insertLast(list, 4);
        System.out.println(Arrays.toString(list.toArray()));

        replace(list, 3);
        removeThird(list);
        System.out.println(Arrays.toString(list.toArray()));

    }

    public static void insertFirst(ArrayList<Integer> list, int value) {
        if (list.isEmpty()) {
            list.add(value);
        } else {
            list.add(0, value);
        }
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("can't remove from list empty");
        }
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("can't remove from list empty");
        }

        int indexRemove = list.indexOf(666);
        if (indexRemove != -1) {
            list.remove(indexRemove);
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(i * i);
        }
        return result;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if (!target.isEmpty()) {
            target = new ArrayList<>();
            for (Integer i : source) {
                target.add(i);
            }
        } else {
            for (Integer i : source) {
                target.add(i);
            }
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        if (list.size() <= 1 || list == null) {
            return;
        }
        Integer value = list.remove(0);
        reverseManual(list);
        list.add(value);
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
