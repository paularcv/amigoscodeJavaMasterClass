package com.amigoscode.classesAndObjects;

public class CarDealership {

    private String name;
    private int maxNumberOfCars;
    private Car[] carsInStock;

    public CarDealership(String name, int maxNumberOfCars) {
        this.name = name;
        this.maxNumberOfCars = maxNumberOfCars;
        this.carsInStock = new Car[maxNumberOfCars];
    }

    public String getName() {
        return name;
    }

    public int getMaxNumberOfCars() {
        return maxNumberOfCars;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public int getCarsInStockCount() {
        int count = 0;
        for (Car car : carsInStock) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxNumberOfCars(int maxNumberOfCars) {
        this.maxNumberOfCars = maxNumberOfCars;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }

    // method to add a car to the dealership's stock
    public void addCar(Car car) {
        int currentStockCount = getCarsInStockCount();
        if (currentStockCount < maxNumberOfCars) {
            carsInStock[currentStockCount] = car;
            System.out.println(car.getManufacturer() + " " + car.getEngineType() + " car added to stock.");
        } else {
            System.out.println("Sorry, the maximum capacity of cars on display has been reached.");
        }
    }

    // method that returns the first Car in the dealership stock with a manufacturer that matches the input
    public Car findCarByManufacturer(String manufacturer) {
        for (Car car : carsInStock) {
            if (car != null && car.getManufacturer().equals(manufacturer)) {
                return car;
            }
        }
        return null;
    }


}
