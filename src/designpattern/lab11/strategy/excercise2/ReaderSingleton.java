package designpattern.lab11.strategy.excercise2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderSingleton {
    private static ReaderSingleton instance;
    private BufferedReader READER;

    private ReaderSingleton() {
        READER = new BufferedReader(new InputStreamReader(System.in));
    }

    public static ReaderSingleton getInstance() {
        if (instance == null) {
            instance = new ReaderSingleton();
        }

        return instance;
    }

    public String getLine() throws IOException {
        return READER.readLine();
    }
}
