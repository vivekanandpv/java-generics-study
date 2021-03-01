package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Container<Vehicle> vehicleContainer = new Container<>();

        List<Vehicle> vehicleList = List.of(new Vehicle(), new Truck(), new Car(), new SportsCar());
        List<Truck> truckList = List.of(new Truck(), new Truck());
        List<Car> carList = List.of(new Car(), new Car());
        List<SportsCar> sportsCarList = List.of(new SportsCar(), new SportsCar());

        vehicleContainer.addCollection(sportsCarList);
        vehicleContainer.addCollection(carList);
        vehicleContainer.addCollection(truckList);
        vehicleContainer.addCollection(vehicleList);

        for(Vehicle v: vehicleContainer) {
            System.out.println(v.getClass());
        }
    }
}
