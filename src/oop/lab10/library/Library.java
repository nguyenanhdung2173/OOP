package oop.lab10.library;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent tmp = rents[0];
        for (Rent element : rents) {
            long timeRent = tmp.getEnd().getTime() - tmp.getBegin().getTime();
            long timeRentElement = element.getEnd().getTime() - element.getBegin().getTime();
            if (timeRent < timeRentElement) {
                tmp = element;
            }
        }
        return tmp;
    }
}
