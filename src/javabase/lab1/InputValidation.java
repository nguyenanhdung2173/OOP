package javabase.lab1;

import java.util.Scanner;

public class InputValidation {
    public static final Scanner sc = new Scanner(System.in);
    public static void validInput(boolean isValid){
        int numberIn;
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = sc.nextInt();
            if ((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100)){
                isValid = true;
                System.out.println("You have entered: "+ numberIn);
                break;
            }

            System.out.println( " Invalid input, try again...");
        } while (!isValid);
    }

    public static void main(String[] args) {
       boolean isValid = false;

       validInput(isValid);
    }
}
