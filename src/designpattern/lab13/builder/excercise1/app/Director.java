package designpattern.lab13.builder.excercise1.app;


import designpattern.lab13.builder.excercise1.builders.Builder;
import designpattern.lab13.builder.excercise1.cars.CarType;
import designpattern.lab13.builder.excercise1.cars.Engine;
import designpattern.lab13.builder.excercise1.cars.GPS;
import designpattern.lab13.builder.excercise1.cars.TripComputer;

public class Director {
    public void makeSportsCar(Builder builder) {
        builder.reset()
                .setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());
    }

    public void makeSUV(Builder builder) {
        builder.reset()
                .setCarType(CarType.Suv)
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());

    }
}
