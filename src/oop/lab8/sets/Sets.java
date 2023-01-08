package oop.lab8.sets;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 7, 8, 9, 10));

        System.out.println(Arrays.toString(set1.toArray()));
        System.out.println(Arrays.toString(set2.toArray()));

        Set<Integer> set3 = intersectionManual(set1, set2);
        System.out.println(Arrays.toString(set3.toArray()));

        Set<Integer> set4 = unionManual(set1, set2);
        System.out.println(Arrays.toString(set4.toArray()));


        List<Integer> list1 = toList(set1);
        list1.add(1);
        list1.add(2);
        System.out.println(Arrays.toString(list1.toArray()));

        List<Integer> list2  = removeDuplicates(list1);
        System.out.println(Arrays.toString(list2.toArray()));
    }


    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : first) {
            for (Integer j : second) {
                if (i.equals(j)) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        for (Integer i : second) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    public static List<Integer> toList(Set<Integer> sourse) {
        List<Integer> list = new ArrayList<>(sourse);
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> tmp = new HashSet<>(source);
        return new ArrayList<Integer>(tmp);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        int index = 0;
        for (int i = 1; i < source.size(); i++) {
            if (source.get(i) == source.get(index)) {
                source.remove(i);
            } else {
                index++;
            }
        }
        return source;
    }

    public static String firstRecurringCharacter(String s) {
        int index = 0;
        String result = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(index) == s.charAt(i)) {
                return result + s.charAt(index);
            }
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> result = new HashSet<>();
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(index) == s.charAt(i)) {
                result.add(s.charAt(index));
            } else {
                index++;
            }
        }
        return result;
    }

    public static Integer[] toArrays(Set<Integer> sourse) {
        Integer[] result = (Integer[]) sourse.toArray();
        return result;
    }

    public static int getFirst(TreeSet<Integer> sourse) {
        return sourse.first();
    }

    public static int getLast(TreeSet<Integer> sourse) {
        return sourse.last();
    }

    public static ArrayList<Integer> getGreater(TreeSet<Integer> source, int value) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : source) {
            if (i > value) {
                list.add(i);
            }
        }
        return (ArrayList<Integer>) list;
    }

}
