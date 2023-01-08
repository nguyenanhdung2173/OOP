package javabase.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static final Scanner SC = new Scanner(System.in);
    public static final int NUM_STUDENTS = 3;
    public static double averageInvalidInput(boolean isValid){
        int sum = 0;
        int numberIn;
        double average;

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            do {
                System.out.printf("Enter the mark (0-100) for student %d : ", studentNo);
                numberIn = SC.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = false;
                    break;
                }

            System.out.println("Invalid input, try again...");
            } while (!isValid);
            sum += numberIn;
        }

        average = (double) sum / NUM_STUDENTS;
        return average;
    }

    public static void main(String[] args) {
        boolean isvalid = false;

        System.out.printf("The average is: %.2f%n", averageInvalidInput(isvalid));

    }
}
