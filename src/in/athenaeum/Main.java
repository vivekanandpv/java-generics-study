package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  https://en.wikipedia.org/wiki/Generics_in_Java#Problems_with_type_erasure

        //  For every generic type, compiler produces a raw type
        List rawVehicleList = new ArrayList();  // IDE may warn

        rawVehicleList.add((Vehicle) new Car());  // cast insertion at input position

        Vehicle vehicle = (Vehicle) rawVehicleList.get(0);  //  cast insertion at output position
    }
}
