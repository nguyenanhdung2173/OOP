package oop.lab10.mymap;

public class TestApp {
    public static void main(String[] args) {
        MyMap map = new MyHashMap();
        map.put(1, "nam");
        map.put(2, "quan");
        System.out.println(map.contains(1));
        System.out.println(map.size());
        System.out.println(map);
    }
}
