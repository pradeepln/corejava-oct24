package com.cisco.training.basics;

public class VehicleApp {

	public static void main(String[] args) {
		Driver d = new Driver();

		Car c = new Car();
		
		d.drive(c); //type substitution
		
		Truck t = new Truck();
		
		d.drive(t); //type sub
		
		
		//Vehicle v = new Vehicle(); //new Car();
		
		Object o = "sss";
		o = new Driver();
		o = new Car();
	}

}
