package javabase.lab2;

import java.util.Scanner;

public class GradesStatistics {
    public static int[] grades;

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        grades = new int[number];
        int i = 0;
        while (i < number) {
            System.out.printf("Enter the grade for student %1$d: ", i + 1);
            int grade = sc.nextInt();
            if (grade >= 0 && grade <= 100) {
                grades[i] = grade;
                i++;
            } else {
                System.out.println("Error !!!");
            }
        }
        sc.close();
    }

    public static void print(int[] array) {
        assert array != null;
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < array.length - 1; i++) {
            str.append(array[i] + ", ");
        }
        str.append(array[array.length - 1] + "]");

        System.out.println(str);
    }

    public static double average(int[] array) {
        assert array != null;
        int sum = 0;
        for (int i :
                array) {
            sum += i;
        }
        return (double) sum / array.length;
    }

    public static double median(int[] array) {
        assert array != null;

        double median = 0;
        int length = array.length;
        if (length == 1) {
            median = array[0];
        } else {
            if ((length & 2) == 1) {
                median = array[(length + 1) / 2 - 1];
            } else {
                median = (array[(length / 2 - 1)] + array[length / 2]) / 2;
            }
        }
        return median;
    }

    public static int max(int[] array) {
        assert array != null;

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int min(int[] array) {
        assert array != null;

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static double stdDev(int[] array) {
        assert array != null;
        double average = average(array);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += (double) array[i] * array[i] - average * average;
        }
        return Math.sqrt(sum / array.length);
    }

    public static void main(String[] args) {
        readGrades();

        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is: %.2f \n", average(grades));
        System.out.printf("The median is: %.2f \n", median(grades));
        System.out.printf("The minimum is: %d \n", min(grades));
        System.out.printf("The maximum is: %d \n", max(grades));
        System.out.printf("The stadard deviation is: %.2f \n", stdDev(grades));
    }
}
