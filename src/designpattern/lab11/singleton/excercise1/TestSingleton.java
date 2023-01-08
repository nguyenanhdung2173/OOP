package designpattern.lab11.singleton.excercise1;

public class TestSingleton {
    public static void main(String[] args) {
        Database database1 = Database.getInstance();
        System.out.println(database1);


        Database database2 = Database.getInstance();
        System.out.println(database2);
    }
}
