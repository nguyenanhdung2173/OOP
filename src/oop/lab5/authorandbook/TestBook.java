package oop.lab5.authorandbook;

public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tam ah Teck", "ahTeck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook = new Book("java for  dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is : " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more java", new Author("Paul Tan", "paul@somwhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}
