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

   public  double accelerate(double speed, double durationInHours){
      if (fuelLevel <=0){
          System.out.println("Not enough fuel.");
          return 0;
      }

      if (speed > maxSpeed){
          System.out.println("Max speed exceeded!");
       return 0;
      }

     else if (speed == maxSpeed) {
          System.out.println("Be careful Max speed reached!");
      }
      else {
          System.out.println("Valid speed entered.");
      }


      double mileageMultiplier = 1;
       if (speed > 120) {
       mileageMultiplier = speed / 100;
       }

// Audi is accelerating whit 60 km/h for 1h
       System.out.println(name + "is accelerating whit " + speed + " km/h for " + durationInHours + " h");

     // local variable
      double traveledDistance = speed * durationInHours;
       System.out.println("Traveled distance: " + traveledDistance);

       totalDistance += traveledDistance;

       System.out.println("Total traveled distance: " + totalDistance);

       double usedFuel = traveledDistance * mileage / 100;

       usedFuel *= mileageMultiplier;

       fuelLevel = fuelLevel - usedFuel;
       //same result as the instruction above
//       fuelLevel -= usedFuel;

       System.out.println("Remaining fuel: " + fuelLevel);
       return traveledDistance;

   }

   public void  decelerate () {
       // todo: implement this
       System.out.println("This is just a demo method");
   }
}