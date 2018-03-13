package com.gareth;

/* This is OpenClosedGood */

public class Administrator implements Employee {

    double percent;

    Administrator()
    {

    }

    Administrator(double percent) {

        this.percent = percent;

    }

    public double getPercent() {
        return percent;
    }

    public double yearlySalaryBonus(int sal) {
        return sal * percent;
    }
}

