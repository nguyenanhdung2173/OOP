package designpattern.lab13.builder.excercise1.cars;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final TripComputer tripComputer;
    private final GPS gps;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, TripComputer tripComputer, GPS gps) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPS getGps() {
        return gps;
    }
}
