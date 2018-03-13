package com.gareth;

/* This is SingleResponsibilityBad */

public class Bus {

    private String model;
    private int numOfWheels;

    Bus()
    {

    }

    Bus(String model, int numOfWheels)
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


    public void brakeAndTurn()
    {
        System.out.println("Please use the brakepad to brake");
        System.out.println("Now that you have braked, please use the steering wheel to turn" );
    }
}
