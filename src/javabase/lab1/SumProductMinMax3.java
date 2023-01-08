package javabase.lab1;

import java.util.Scanner;

public class SumProductMinMax3 {

    public static int sum(int a, int b, int c){
        return  a + b + c;
    }

    public static int product(int a, int b, int c){
        return a * b * c;
    }

    public static  int findMin(int a, int b, int c){
        int min = a;
        if (a > b){
            min = b;
            if ( b > c){
                min = c;
            }
        }
        return min;
    }
    public static  int findMax(int a, int b, int c){
        int max = a;
        if (a < b){
            max = b;
            if ( b > c){
                max = c;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter 1st integer: " + a);
        System.out.println("Enter 2st integer: " + b);
        System.out.println("Enter 3st integer: " + c);
        sc.close();

        System.out.println("The sum is: "  + sum(a, b, c));
        System.out.println("The product is: " + product(a, b, c));
        System.out.println("The min is: " + findMin(a, b, c));
        System.out.println("The max is: " + findMax(a, b, c));
    }
}
