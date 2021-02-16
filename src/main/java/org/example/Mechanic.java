package org.example;

public class Mechanic {

      public  void  repair (Vehicle vehicle) {

          System.out.println( "Repairing vehicle " + vehicle.getName());
          vehicle.setTotalDistance(-1);
          vehicle.setDamaged (false);
      }

}
