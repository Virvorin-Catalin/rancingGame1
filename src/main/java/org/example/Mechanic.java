package org.example;

public class Mechanic {

      public  void  repair (Vehicle vehicle) {

          System.out.println("Repairing " + vehicle.name);
          vehicle.totalDistance --;
          vehicle.damaged = false;

      }

}
