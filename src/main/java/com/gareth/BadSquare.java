package com.gareth;

public class BadSquare extends BadRectangle {

    private int length;
    private int breadth;

    public int getLength()
    {
        return super.length;
    }

    public void setLength(int length)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth()
    {
        return super.breadth;
    }

    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
        this.length = length;
    }



}
