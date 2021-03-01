package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  An array
        Car[] cars = new Car[] {new Car(), new SportsCar(), new Car()};

        workWithVehicleArray(cars);
    }

    //  Car is a Vehicle
    //  Car[] is a Vehicle[]; arrays are covariant (array subtyping in covariant)
    //  But List<Car> is not a List<Vehicle>
    public static void workWithVehicleArray(Vehicle[] vehicles) {
        //  vehicles[0] = new Vehicle();    //   throws ArrayStoreException. Why?

        for (Vehicle v: vehicles) {
            System.out.println(v.getClass());
        }

        //  Arrays are not contravariant in Java
        //  But this check happens in runtime
        //  Generic type constraint of contravariance is a guard against ArrayStoreException

        //  Polymorphism for collection types is troublesome
        //  Arrays leave it to you
        //  Generic types guard us

        //  Covariance in arrays was a design decision
        //  It supports sort and other functionalities
    }


}
