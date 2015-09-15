package com.demo.car;

public interface CarBuilder {

	public void setEngine(Engine engine);

	public void setUnderpan(Underpan underpan);

	public void setWheel(Wheel wheel);

	public Car build();

}
