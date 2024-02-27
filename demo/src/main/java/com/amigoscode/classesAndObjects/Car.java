package com.amigoscode.classesAndObjects;

public class Car {

    // Properties
    private String manufacturer;
    private double price;
    private EngineType engineType;

    private enum EngineType {
        DIESEL,
        PETROL,
        ELECTRIC
    }

    // Constructor
    public Car(String manufacturer, double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    // toString method to represent Car object as a string
    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    // Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

}
