package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());

        //  Producer Extends, Consumer Super (PECS)
        addACar(cars);    //  list is consumer
    }

    //  So long as it is a list of Car or any of its super classes,
    //  there is no harm in adding a car (inward position)
    //  list is asked to consume
    //  ? super Car sets the lower-bound (Car or any of its superclasses)
    //  Cannot be called with List<SportsCar> (lower-bound is breached)
    public static void addACar(List<? super Car> anyCarList) {
        //  Car can be added to List<Car>, List<Vehicle>, List<Object>
        anyCarList.add(new Car());  //  inward position

        //  cannot read
        //  Car car = anyCarList.get(0);    //  fails

        //  Self-study:
        //  SportsCar can be added (SportsCar is a car)
        //  But a Vehicle cannot be added. Why?
        //  Because of the lower-bound, List<Car> can be passed
        //  Can we push a Vehicle to List<Car>?
        //  Is Vehicle a Car?
    }
}
