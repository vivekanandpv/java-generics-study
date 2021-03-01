package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  We know a Car is a Vehicle (inheritance relationship)
        Vehicle carAsVehicle = new Car();

        //  Intuitively, we think a collection of Car is a collection of Vehicle
        //  But this is not the case

        //  List<Car> cars = new ArrayList<>();
        //  List<Vehicle> vehicles = cars;    //  fails
        //  vehicles.add(new Vehicle());    //  is Vehicle a Car?

        //  Also,
        //  List<Vehicle> vehicles = new ArrayList<>();
        //  vehicles.add(new Truck());  //  ok
        //  List<Car> cars = vehicles;  //  fails
        //  cars.add(new SportsCar());  //  ok
        //  Car c = cars.get(0);    //  is Truck a Car?
    }
}
