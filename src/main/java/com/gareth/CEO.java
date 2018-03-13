package com.gareth;

/* This is OpenClosedGood */

public class CEO implements Employee {

    double percent;

    CEO()
    {

    }

    CEO(double percent)
    {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public double yearlySalaryBonus(int sal) {
        return sal * percent;
    }
}

