package com.demo.car.byd;

import com.demo.car.Car;
import com.demo.car.Engine;
import com.demo.car.Underpan;
import com.demo.car.Wheel;

public class BydCar implements Car {

	private Engine engine;

	private Underpan underpan;

	private Wheel wheel;

	public BydCar() {

	}

	public BydCar(Engine engine, Underpan underpan, Wheel wheel) {
		this.engine = engine;
		this.underpan = underpan;
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Underpan getUnderpan() {
		return underpan;
	}

	public void setUnderpan(Underpan underpan) {
		this.underpan = underpan;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public void run() {
		getWheel().inflate();
		getUnderpan().up();
		getUnderpan().up();
		getEngine().start();

		// ...
	}

}
