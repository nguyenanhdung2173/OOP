package designpattern.lab11.singleton.excercise1;

public class Database {
    private static Database instance;

    private Database() {

    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }


}
