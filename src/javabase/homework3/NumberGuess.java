package javabase.homework3;

import java.util.Scanner;

public class NumberGuess {

    public static void runGame(Scanner sc) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        int count = 0;
        while (true) {
            System.out.print("Key in your guess: ");
            int key = sc.nextInt();
            count++;
            if (key < SECRET_NUMBER) {
                System.out.println("Try higher");
            } else if (key > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                System.out.printf("You got it in %d trials!", count);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        runGame(sc);
    }
}
