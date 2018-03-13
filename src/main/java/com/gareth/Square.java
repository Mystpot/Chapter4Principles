package com.gareth;

public class Square extends Shape {

    private int sizeOfSquare;

    Square()
    {

    }

    Square (int sizeOfSquare)
    {
        this.sizeOfSquare = sizeOfSquare;
    }

    public int getSizeOfSquare()
    {
        return sizeOfSquare;
    }


    @Override
    public int calcArea()
    {
        return sizeOfSquare * sizeOfSquare;
    }


}
