package designpattern.lab13.builder.excercise1.app;


import designpattern.lab13.builder.excercise1.builders.CarBuilder;
import designpattern.lab13.builder.excercise1.builders.ManualBuilder;
import designpattern.lab13.builder.excercise1.cars.Car;
import designpattern.lab13.builder.excercise1.cars.Manual;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSportsCar(builder);

        Car car = builder.getProduct();
        System.out.println(car.getCarType());


        ManualBuilder manualBuilder = new ManualBuilder();

        director.makeSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("car manual built: " + carManual.print());
    }
}
