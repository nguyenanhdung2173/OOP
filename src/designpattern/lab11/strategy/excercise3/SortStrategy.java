package designpattern.lab11.strategy.excercise3;

public class SortStrategy {
    private ISort sortee;
    private static SortStrategy instance;

    public static SortStrategy getInstance() {
        if (instance == null) {
            instance = new SortStrategy();
        }
        return instance;
    }

    public void setSortee(ISort sortee) {
        this.sortee = sortee;
    }


    public int sort(int[] array) {
        return sortee.sort(array);
    }
}
