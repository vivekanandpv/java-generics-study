package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = List.of(new SportsCar(), new Car());
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle());
        vehicles.add(new Vehicle());

        copy(cars, vehicles);

        for(Vehicle v: vehicles) {
            System.out.println(v.getClass());
        }
    }

    //  Type parameters such as <E> should be declared upfront for methods
    //  A non-generic class such as Main can have a generic method such as copy
    //  Similarly a generic class may have a non-generic method

    //  EG;SP: Extends for get operations; Super for put operations
    //  Both cannot be applied simultaneously.
    //  Use exact type parameter when both get and put are needed.
    public static <E> void copy(List<? extends E> source, List<? super E> target) {
        if (source.size() > target.size()) {
            throw new RuntimeException("Target is shorter than source");
        }

        for(int i = 0; i < source.size(); ++i) {
            target.set(i, source.get(i));
        }
    }
}
