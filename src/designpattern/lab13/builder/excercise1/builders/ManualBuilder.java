package designpattern.lab13.builder.excercise1.builders;

import designpattern.lab13.builder.excercise1.cars.*;


public class ManualBuilder implements Builder {
    private Car car;
    private CarType carType;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;
    public ManualBuilder() {
        this.reset();
    }


    @Override
    public Builder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public Builder reset() {
        this.car =  new Car(carType, seats, engine, tripComputer, gps);
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

    public Manual getResult() {
        return new Manual(carType, seats, engine, tripComputer, gps);
    }
}
