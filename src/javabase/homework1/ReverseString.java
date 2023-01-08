package javabase.homework1;

import java.util.Scanner;

public class ReverseString {

    public static String findReverseString(String s){
       StringBuffer str = new StringBuffer();
        for (int i = s.length() -1 ;i >= 0; i--) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        System.out.printf("The reverse string %s is %s ", s, findReverseString(s));
    }
}
