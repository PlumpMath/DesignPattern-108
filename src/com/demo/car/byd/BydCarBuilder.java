package com.demo.car.byd;

import com.demo.car.AbstractCarBuilder;
import com.demo.car.Car;
import com.demo.car.CarBuilder;
import com.demo.car.Engine;
import com.demo.car.Underpan;
import com.demo.car.Wheel;

public class BydCarBuilder extends AbstractCarBuilder implements CarBuilder {

	@Override
	public Car build() {
		Engine engine = getEngine();
		Underpan underpan = getUnderpan();
		Wheel wheel = getWheel();
		BydCar bydCar = new BydCar();
		bydCar.setEngine(engine);
		bydCar.setUnderpan(underpan);
		bydCar.setWheel(wheel);
		return bydCar;
	}

}
