package com.company;

public class Car extends Vehicle{

    public Car() {

    }

    private String color;
    private int weight;
    private String make;
    private String model;
    private String year;


    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
        @Override
        public String start() {
            return year+ " " +getMake()+ " "+super.getEngineType() +" "+
            super.getSpeed()+" "+ model+super.start();
        }

        @Override
        public String acclerate() {
            return year+" "+getMake()+" " +super.getEngineType()+" "+model+super.acclerate();
        }

        @Override
        public String readSpeed() {
             return year+" "+getMake()+" "+super.getEngineType()+" "+ super.readSpeed();
        }

        @Override
        public String stop() {
            return year+" "+getMake()+ " " +super.getEngineType()+" "+model+super.stop();



    }
}