package com.semanticsquare.oops.DependencyInjection;

public class Car {
	
	private final Engine engine;
	
	public Car(Engine engine) { // This is dependency injection where we are passing the Engine type
		this.engine = engine;
	}

	public void drive() {
		engine.start();
	}
}
