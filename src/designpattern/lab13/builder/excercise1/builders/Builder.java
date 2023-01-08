package designpattern.lab13.builder.excercise1.builders;

import designpattern.lab13.builder.excercise1.cars.CarType;
import designpattern.lab13.builder.excercise1.cars.Engine;
import designpattern.lab13.builder.excercise1.cars.GPS;
import designpattern.lab13.builder.excercise1.cars.TripComputer;

public interface Builder {
    Builder setCarType(CarType carType);
    Builder reset();
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPS(GPS gps);
}
