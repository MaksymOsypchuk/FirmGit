package models;

import base.Salary;

public class Employee implements Salary {

    //переменные для расчета заработной платы
    private double hourlyRate;
    private double totalHours;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public double calculateSalary(double hourlyRate, double totalHours) {
        return 0;
    }
}
