package javabase.homework1;

import java.util.Scanner;

public class checkHexStr {
    public static boolean isHexString(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (!((s.charAt(i) >= '0' && s.charAt(i) <= '9') ||
                    (s.charAt(i) >= 'a' && s.charAt(i) <= 'f'))) {
                return false;
            }
        }

        return true;
    }

    public static boolean isValidHexString(String hexString){
        hexString = hexString.toLowerCase();
        final String HEX_STRING = "123456789abcdef";
        for (int i = 0; i < hexString.length(); i++) {
            if (HEX_STRING.indexOf(hexString.charAt(i)) == -1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        if (isHexString(s)) {
            System.out.printf("%s is a hex string", s);
        } else {
            System.out.printf("%s is not hex string", s);
        }
    }
}
