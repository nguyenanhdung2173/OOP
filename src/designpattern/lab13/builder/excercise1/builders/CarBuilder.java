package designpattern.lab13.builder.excercise1.builders;

import designpattern.lab13.builder.excercise1.cars.*;

public class CarBuilder implements Builder{
    private Car car;
    private CarType type;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;


    public CarBuilder() {
        this.reset();
    }


    @Override
    public Builder setCarType(CarType carType) {
        this.type = carType;
        return this;
    }

    @Override
    public Builder reset() {
        this.car = new Car(this.type, this.seats, this.engine, tripComputer, gps);
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public Builder setGPS(GPS gps) {
        this.gps = gps;
        return this;
    }

    public Car getProduct() {
        return new Car(type, seats, engine, tripComputer, gps);
    }
}
