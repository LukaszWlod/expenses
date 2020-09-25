package com.lukasz;

public class Fuel {
    private double averageFuelEconomyPer100km;
    private double costPerLitre;
    private double distanceToWork;
    private double costWorkDay;
    private short workingDays;


    public Fuel() {
    }

    public Fuel(
            double averageFuelEconomyPer100km,
            double costPerLitre,
            double distanceToWork,
            short workingDays
    ) {
        this.averageFuelEconomyPer100km = averageFuelEconomyPer100km;
        this.costPerLitre = costPerLitre;
        this.distanceToWork = distanceToWork;
        this.workingDays=workingDays;

        double costPerKm = averageFuelEconomyPer100km / 100 * costPerLitre;
        costWorkDay = costPerKm * distanceToWork;
    }

    public double getCostPerDay() {
        return costWorkDay;
    }

    public double getCostPerMouth() {
        double costPerMount = getCostPerDay() * workingDays;
        return costPerMount;
    }




}
