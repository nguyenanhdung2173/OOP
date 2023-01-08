package designpattern.lab11.strategy.excercise3;

import java.util.Arrays;

public class App {
    private static int sizeArray = 10;

    public static int[] createArrayRandom() {
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            int j = (int) (Math.random() * 100.0);
            array[i] = j;
        }
        return array;
    }
    public static void main(String[] args) {
        // using bubble sort algorithm
        int[] array1 = createArrayRandom();
        System.out.println("Before: ");
        System.out.println(Arrays.toString(array1));

        SortStrategy sortStrategy = new SortStrategy();


        ISort sortee = new BubbleSort();
        sortStrategy.setSortee(sortee);

        System.out.println("The number of iterations of the bubble sort algorithms : " + sortStrategy.sort(array1));

        System.out.println("After: ");
        System.out.println(Arrays.toString(array1));

        // using selection sort algorithm
        int[] array2 = createArrayRandom();
        System.out.println("Before: ");
        System.out.println(Arrays.toString(array2));


        ISort sortee1 = new SelectionSort();
        sortStrategy.setSortee(sortee1);
        System.out.println("The number of iterations of the selection sort algorithms : " + sortStrategy.sort(array2));

        System.out.println("After: ");
        System.out.println(Arrays.toString(array2));


        // using insertion sort algorithm
        int[] array3 = createArrayRandom();
        System.out.println("Before: ");
        System.out.println(Arrays.toString(array3));

        ISort sortee2 = new InsertionSort();
        sortStrategy.setSortee(sortee2);
        System.out.println("The number of iterations of the insertion sort algorithms : " + sortStrategy.sort(array3));

        System.out.println("After: ");
        System.out.println(Arrays.toString(array3));
    }
}
