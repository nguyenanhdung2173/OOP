package javabase.homework1;


import java.util.Scanner;

public class SquarePattern {

    public static void printSquarePattern(int n){
        int col = 1;
        while (col <= n) {
            for (int row = 1; row <= n; row++) {
                System.out.print("# ");
            }
            System.out.println();
            col++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: " );
        int n = sc.nextInt();

        printSquarePattern(n);
    }
}
