package designpattern.lab11.strategy.excercise3;

public class InsertionSort implements ISort{
    @Override
    public int sort(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[i -1]) {
                count++;
                shiftElement(array, i);
            }
        }
        return count;
    }

    public void shiftElement(int[] array, int i) {
        int iValue = array[i];
        while (i > 0 && array[i-1] > iValue) {
            array[i] = array[i - 1];
            i--;
        }
        array[i] = iValue;
    }
}
