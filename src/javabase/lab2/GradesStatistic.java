package javabase.lab2;

import java.util.Scanner;

public class GradesStatistic {
    public static final Scanner SC = new Scanner(System.in);
    public static boolean IS_VALID = false;

    public static int[] readGrades(int numStudent) {
        int numIn;
        int[] arrayGrades = new int[numStudent];
        for (int stuNo = 1; stuNo <= numStudent; stuNo++) { //stuNo: student number
            do {
                System.out.printf("Enter the grade for student %d:", stuNo);
                numIn = SC.nextInt();
                if (numIn >= 0 && numIn <= 100) {
                    arrayGrades[stuNo - 1] = numIn;
                    IS_VALID = false;
                    break;
                }
                System.out.println("Invalid input, try again...");
            } while (!IS_VALID);
        }
        return arrayGrades;
    }

    public static double calcAverage(int[] grades) {
        int sum = 0;
        double arrage;
        for (int grade : grades) {
            sum += grade;
        }
        arrage = sum * 1.0 / grades.length;
        return arrage;
    }

    public static int findMaxGrade(int[] grades) {
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) max = grade;
        }
        return max;
    }

    public static int findMinGrade(int[] grades) {
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) min = grade;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        int numStudent = SC.nextInt();

        // read array grades
        int[] grades = readGrades(numStudent);
        System.out.printf("The average is: %.2f \n", calcAverage(grades));
        System.out.printf("The minimum is: %d \n", findMinGrade(grades));
        System.out.printf("The maximum is: %d \n", findMaxGrade(grades));
    }
}
