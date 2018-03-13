package com.gareth;

/* This is SingleResponsibilityGood */

public class Car implements CarInterface {



    private String model;
    private int numOfWheels;

    Car()
    {

    }

    Car(String model, int numOfWheels, String steeringWheel, String brakePad, String accelator)
    {
        this.model = model;
        this.numOfWheels = numOfWheels;

    }

    public String getModel()
    {
        return model;
    }

    public int getNumOfWheels()
    {
        return numOfWheels;
    }


    public void turn()
    {
        System.out.println("Please use the steering wheel to turn.");
    }

    public void brake()
    {
        System.out.println("Please use the brake pad to stop.");
    }

    public String toString()
    {
        return String.format("This is a %s, with %d wheels", model, numOfWheels);
    }

}
