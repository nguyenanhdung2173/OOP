package javabase.lab1;

public class SumAverageRunningInt {
    public static void printSumAverageNumber(){
        int sum = 0;
        int count = 0;
        for (int i = 111; i <= 8899; i++) {
            sum += i;
            count++;
        }
        System.out.println("sum:" + sum);
        System.out.println("average : "+ sum / count);

    }

    public static void printSumSqaredNumber(){
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i*i;
        }
        System.out.println("sum of the squares: " + sum);
    }

    public static void main(String[] args) {
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        // using while - do
        {
            int sum = 0;
            int count = 0;
            int number = LOWERBOUND;
            while (number <= UPPERBOUND) {
                sum += number;
                number++;
                count++;
            }
            System.out.println("sum:" + sum);
            System.out.println("average : "+ sum / count);
        }

        //  using do - while
        {
            int sum = 0;
            int count = 0;
            int number = LOWERBOUND;
            do {
                sum += number;
                number++;
                count++;
            } while(number <=UPPERBOUND);
            System.out.println("sum:" + sum);
            System.out.println("average : "+ sum / count);
        }

        printSumAverageNumber();
        printSumSqaredNumber();
    }
}
