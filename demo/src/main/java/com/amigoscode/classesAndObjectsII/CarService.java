package com.amigoscode.classesAndObjectsII;

public class CarService {

    public void repairCar(Car car) {
        System.out.println("Car " + car.getMake() + " " + car.getModel() + " is repaired");
    }

    public void washCar(Car car) {
        System.out.println("Car " + car.getMake() + " " + car.getModel() + " is washed");
    }

    public void refuelCar(Car car) {
        System.out.println("Car " + car.getMake() + " " + car.getModel() + " is refueled");
    }
}
