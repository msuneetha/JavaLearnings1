package com.semanticsquare.oops.DependencyInjection;

public class EngineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Engine engine = new GasEngine();
		Car car = new Car(engine); //dependency Injection where we are passing GasEngine in the constructor
									//This is called constructor Injection
		car.drive();
		
		Engine engine2 = new ElectricEngine();
		Car car2 = new Car(engine2); //dependency Injection where we are passing GasEngine in the constructor
									//This is called constructor Injection
		car2.drive();

	}

}
