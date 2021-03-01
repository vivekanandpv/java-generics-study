package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());

        //  Producer Extends, Consumer Super (PECS)
        printVehicles(cars);    //  list is producer
    }

    //  It's ok to read the subclass elements as superclass elements
    //  list is used in outward positions (asked to produce)
    //  ? is wildcard
    //  ? extends Vehicle sets the upper-bound (Vehicle or any of its subclasses)
    public static void printVehicles(List<? extends Vehicle> anyVehicleList) {
        //  Vehicle can be read from List<Vehicle>, List<Truck>, List<Car>, List<SportsCar>
        for(Vehicle v: anyVehicleList) {    //  outward position
            System.out.println(v.getClass());
        }

        //  cannot add (use list in inward position)
        //  anyVehicleList.add(new Vehicle());  //  fails

        //  Self-study:
        //  Can we read the elements as any subclass of Vehicle?
        //  Car car = anyVehicleList.get(0);    //  fails. Why?
        //  If List<Truck> or List<Vehicle> is passed,
        //  Can we read it as a Car?
        //  Is Truck a Car? Or, is Vehicle a Car?
    }
}
