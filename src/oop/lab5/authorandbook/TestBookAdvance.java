package oop.lab5.authorandbook;

public class TestBookAdvance {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAdvance javaDummy = new BookAdvance("java for dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
