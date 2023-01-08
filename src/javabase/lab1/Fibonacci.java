package javabase.lab1;

public class Fibonacci {
    public static void printTribonacci(){
        int T1 = 1;
        int T2 = 1;
        int T3 = 2;
        int Tn = T1 + T2 + T3;
        int Tmax = 20;
        System.out.print("The first 20 Tribonacci numbers are: " + T1 + " " + T2 + " " + T3 + " ");


        for (int i = 4; i <= Tmax; i++) {
            System.out.print(Tn + " ");
            T1 = T2;
            T2 = T3;
            T3 = Tn;
            Tn = T1 + T2 + T3;
        }
        System.out.println();
    }

    public static void printFibonacci(){
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.print("The first " + nMax + " Fibonacci numbers are: " + fnMinus1 + " " + fnMinus2);

        while (n <= nMax){
            fn = fnMinus1 + fnMinus2;
            sum += fn;
            System.out.print(" " + fn);
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }

        // compute and display the average
        System.out.println("\n average: " + (double) sum / nMax);
    }
    public static void main(String[] args) {
        printFibonacci();


        printTribonacci();
    }
}
