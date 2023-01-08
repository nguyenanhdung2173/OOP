package oop.lab8.maps;
import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 4);

        System.out.println(map.entrySet());
        System.out.println("size map: " + count(map));

        //empty(map);
        //System.out.println(map.entrySet());

        System.out.println("2 in map ? " +  (contains(map,2) ? "Yes" : "No"));

        System.out.println("keys in map: ");
        System.out.print(Arrays.toString(keySet(map).toArray()));

        System.out.println("\n color : " + getColor(1));
    }


    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.entrySet().contains(key);
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");
        return map.get(value);
    }
}
