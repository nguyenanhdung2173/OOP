package designpattern.lab11.strategy.excercise3;

public class SelectionSort implements ISort{

    @Override
    public int sort(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] > array[j]) {
                    count++;
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return count;
    }
}
