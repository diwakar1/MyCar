package com.company;

public class Vehicle {

    public Vehicle() {
        System.out.println("\nA new Car has been created!");
    }

    private int numberOfWheels;
    private String engineType;
    public int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }



    public String start() {

        return " is starting";
    }

    public String acclerate() {

        return " is accelerating.";
    }
    public String readSpeed() {
       return "is going  " + getSpeed() + " mph...";
    }

    public String stop() {

        return " is stopped";
    }
}