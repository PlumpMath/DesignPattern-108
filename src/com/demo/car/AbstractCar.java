package com.demo.car;

public abstract class AbstractCar implements Car {

	private Engine engine;

	private Underpan underpan;

	private Wheel wheel;

	protected AbstractCar() {

	}

	protected AbstractCar(Engine engine, Underpan underpan, Wheel wheel) {
		this.engine = engine;
		this.underpan = underpan;
		this.wheel = wheel;
	}

	protected Engine getEngine() {
		return engine;
	}

	protected void setEngine(Engine engine) {
		this.engine = engine;
	}

	protected Underpan getUnderpan() {
		return underpan;
	}

	protected void setUnderpan(Underpan underpan) {
		this.underpan = underpan;
	}

	protected Wheel getWheel() {
		return wheel;
	}

	protected void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

}
