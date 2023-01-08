package designpattern.lab13.builder.excercise1.cars;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("car is started!");
        } else {
            System.out.println("car isn't started!");
        }
    }
}
