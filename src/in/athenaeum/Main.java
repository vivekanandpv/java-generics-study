package in.athenaeum;

public class Main {

    public static void main(String[] args) {
        //  Regular polymorphism for the contained element
	    Container<Vehicle> vehicleContainerForVehicle
                = new Container<>(new Vehicle());

	    Container<Vehicle> vehicleContainerForCar
                = new Container<>(new Car());

	    Container<Vehicle> vehicleContainerForTruck
                = new Container<>(new Truck());

	    Container<Vehicle> vehicleContainerForSportsCar
                = new Container<>(new SportsCar());

        System.out.println(vehicleContainerForVehicle.getElement().getClass().getName());
        System.out.println(vehicleContainerForCar.getElement().getClass().getName());
        System.out.println(vehicleContainerForTruck.getElement().getClass().getName());
        System.out.println(vehicleContainerForSportsCar.getElement().getClass().getName());
    }
}
