package javabase.lab1;

public class ComputePI {
    public static double computePI(int MAX_TERM){
        double sum = 0.0;
        for (int term = 1; term < MAX_TERM; term++) {
            if (term % 2 == 1){
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        return 4 * sum;
    }

    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int deminator = 1; deminator <= MAX_DENOMINATOR; deminator += 2) {
            if (deminator % 4 == 1){
                sum += (double) 1 / deminator;
            } else if (deminator % 4 == 3){
                sum -= (double) 1/ deminator;
            } else {
                System.out.println("Impossible");
            }
        }
        System.out.println("Pi: " + 4 * sum);

        System.out.println(computePI(10000));

        // compare the values obtained and the math.PI
        System.out.printf("(piComputed/Math.PI)*100 = %.2f \n", (sum * 4) / Math.PI);
    }
}
