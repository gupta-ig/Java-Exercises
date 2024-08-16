package DesignPatterns;


public class CarDealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sedan = CarFactory.getCar("sedan");
        sedan.drive();  // Output: Driving a sedan.

        Car suv = CarFactory.getCar("suv");
        suv.drive();  // Output: Driving an SUV.

        Car truck = CarFactory.getCar("truck");
        truck.drive();  // Output: Driving a truck.
	}

}
