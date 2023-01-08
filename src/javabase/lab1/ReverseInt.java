package javabase.lab1;

import java.util.Scanner;

public class ReverseInt {

    public static int reverseNumber(int number){
        int inDigit;
        int reverseNumber = 0;
        while (number > 0 ){
            inDigit = number % 10;
            reverseNumber = reverseNumber * 10 + inDigit;
            number /= 10;
        }

        return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();


        System.out.print("The reverse number is: " + reverseNumber(number));
    }
}
