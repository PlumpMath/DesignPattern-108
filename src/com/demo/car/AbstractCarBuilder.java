package com.demo.car;

public abstract class AbstractCarBuilder implements CarBuilder {

	private Engine engine;

	private Underpan underpan;

	private Wheel wheel;

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setUnderpan(Underpan underpan) {
		this.underpan = underpan;
	}

	@Override
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	protected Engine getEngine() {
		return engine;
	}

	protected Underpan getUnderpan() {
		return underpan;
	}

	protected Wheel getWheel() {
		return wheel;
	}

}
