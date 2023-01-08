package oop.lab5.authorandbook;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tam ah Teck", "ahTeck@nowhere.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("panlTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
