package com.demo.car.benz;

import com.demo.car.AbstractCarBuilder;
import com.demo.car.Car;
import com.demo.car.CarBuilder;
import com.demo.car.Engine;
import com.demo.car.Underpan;
import com.demo.car.Wheel;

class BenzCarBuilder extends AbstractCarBuilder implements CarBuilder {

	@Override
	public Car build() {
		Engine engine = getEngine();
		Underpan underpan = getUnderpan();
		Wheel wheel = getWheel();
		Car benzCar = new BenzCar(engine, underpan, wheel);
		return benzCar;
	}

}
