package oop.homework6;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger number1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger number2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
    }
}
