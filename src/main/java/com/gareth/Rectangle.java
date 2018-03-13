package com.gareth;

public class Rectangle extends Shape {

    private int length;
    private int breadth;

    Rectangle()
    {

    }

    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength()
    {
        return length;
    }

    public int getBreadth()
    {
        return breadth;
    }

    @Override
    public int calcArea()
    {
        return length * breadth;
    }



}
