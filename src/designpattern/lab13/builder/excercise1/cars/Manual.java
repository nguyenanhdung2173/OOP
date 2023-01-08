package designpattern.lab13.builder.excercise1.cars;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final TripComputer tripComputer;
    private final GPS gps;

    public Manual(CarType carType, int seats, Engine engine, TripComputer tripComputer, GPS gps) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gps != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
