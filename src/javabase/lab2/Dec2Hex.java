package javabase.lab2;

import java.util.Scanner;

public class Dec2Hex {
    public static String toHex(int decimal) {
        String hex = "";
        char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            int temp = decimal % 16;
            hex = hexChar[temp] + hex;
            decimal /= 16;
        }
        return hex;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        System.out.printf("Enter equivalent hexadicimal number is %1$s", toHex(decimal));
    }
}
