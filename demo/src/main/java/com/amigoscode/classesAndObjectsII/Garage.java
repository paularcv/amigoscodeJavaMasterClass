package com.amigoscode.classesAndObjectsII;

public class Garage {

    private int id;
    private String name;
    private int numberOfCarsAllowed;
    private Car[] cars;

    public Garage(int capacity) {
        cars = new Car[capacity];
        numberOfCarsAllowed = 0;
    }

    public void addCar(Car car) {
        if (numberOfCarsAllowed < cars.length) {
            cars[numberOfCarsAllowed] = car;
            numberOfCarsAllowed++;
        } else {
            System.out.println("Garage is full");
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < numberOfCarsAllowed; i++) {
            if (cars[i] == car) {
                for (int j = i; j < numberOfCarsAllowed - 1; j++) {
                    cars[j] = cars[j + 1];
                }
                cars[numberOfCarsAllowed - 1] = null;
                numberOfCarsAllowed--;
                break;
            }
        }
    }

    public Car[] getAllCars() {
        Car[] allCars = new Car[numberOfCarsAllowed];
        System.arraycopy(cars, 0, allCars, 0, numberOfCarsAllowed);
        return allCars;
    }

}
