package javabase.lab1;

public class CheckOddEven {
    public static boolean isOddNumber(int n){
        if (n % 2 == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 49;
        System.out.println("The number is " + number);
        if (isOddNumber(number)) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
    }
}
