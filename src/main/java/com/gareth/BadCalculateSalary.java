package com.gareth;

/* This is OpenClosedGood */

public class BadCalculateSalary {

        public double yearlySalaryBonusCle(Cleaner cle) {
            return cle.getCleSalary() * cle.getPercent();
        }

        public double yearSalaryBonusTec(Technician tec){
            return tec.getTechSalary() * tec.getPercent();

        }
}
