package javabase.lab1;

public class ExtractDigits {
    public static void printExtractDigits(int n){
        System.out.println("the digit of number are: ");
        while (n > 0){
            int digit = n % 10;
            System.out.print(digit + " ");
            n /= 10;
        }
    }

    public static void main(String[] args) {
        printExtractDigits(15423);
    }
}
