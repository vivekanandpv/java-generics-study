package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  https://en.wikipedia.org/wiki/Generics_in_Java#Problems_with_type_erasure

        //  Type parameter is erased in the runtime
        List<Vehicle> vehicleList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        //  In the runtime, it's just List (of Object)
        System.out.println(vehicleList.getClass() + " = " + stringList.getClass());
    }
}
