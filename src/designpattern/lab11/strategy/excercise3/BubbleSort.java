package designpattern.lab11.strategy.excercise3;

public class BubbleSort implements ISort {

    @Override
    public int sort(int[] array) {
        int count = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j] < array[j - 1]) {
                    count++;
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
        return count;
    }
}
