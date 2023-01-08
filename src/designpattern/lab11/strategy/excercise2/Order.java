package designpattern.lab11.strategy.excercise2;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    private PayStrategy payMethod;


    public void processOrder() {
        payMethod.collectPaymentDetails();
    }

    public void setPayMethod(PayStrategy payMethod) {
        this.payMethod = payMethod;
    }

    public PayStrategy getPayMethod() {
        return payMethod;
    }
    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost += totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
