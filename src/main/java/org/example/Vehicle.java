package org.example;

public class Vehicle {

    //instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
    double totalDistance;
    boolean damaged;

   public  double accelerate(double speed, double durationInHours) {
// Audi is accelerating whit 60 km/h for 1h
       System.out.println(name + "is accelerating whit " + speed + " km/h for " + durationInHours + " h");

     // local variable
      double traveledDistance = speed * durationInHours;
       System.out.println("Traveled distance: " + traveledDistance);

       totalDistance += traveledDistance;

       System.out.println("Total traveled distance: " + totalDistance);

       double usedFuel = traveledDistance * mileage / 100;

       fuelLevel = fuelLevel - usedFuel;
       //same result as the instruction above
//       fuelLevel -= usedFuel;

       System.out.println("Remaining fuel: " + fuelLevel);
       return traveledDistance;
   }
}