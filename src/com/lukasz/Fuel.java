package com.lukasz;

public class Fuel {
 private  double averageFuelEconomyPer100km;
 private double costPerLitre;
 private double distanceToWork;
 private double costPerDay;

 public Fuel(){}
 public Fuel (
         double averageFuelEconomyPer100km,
         double costPerLitre,
         double distanceToWork
 ){
   this.averageFuelEconomyPer100km=averageFuelEconomyPer100km;
   this.costPerLitre=costPerLitre;
   this.distanceToWork=distanceToWork;

     double costPerKm =averageFuelEconomyPer100km/100*costPerLitre;
     costPerDay=costPerKm*distanceToWork;
 }

 public  double getCostPerDay(){
     return costPerDay;
 }



}
