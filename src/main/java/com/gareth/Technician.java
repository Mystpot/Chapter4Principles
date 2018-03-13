package com.gareth;

/* This is OpenClosedBad */

public class Technician {

    double percent;
    double techSalary;

    Technician()
    {

    }

    Technician(double percent, double techSalary)
    {
        this.percent = percent;
        this.techSalary = techSalary;
    }

    public double getPercent()
    {
        return percent;
    }

    public double getTechSalary()
    {
        return techSalary;
    }
}

