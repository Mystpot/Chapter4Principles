package com.gareth;

public class BadRectangle {

    protected int breadth;
    protected int length;

    BadRectangle()
    {

    }

    BadRectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int calcArea()
    {
        return breadth * length;
    }
}
