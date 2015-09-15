package com.demo.car.bmw;

import com.demo.car.AbstractCarBuilder;
import com.demo.car.Car;
import com.demo.car.CarBuilder;
import com.demo.car.Engine;
import com.demo.car.Underpan;
import com.demo.car.Wheel;

class BmwCarBuilder extends AbstractCarBuilder implements CarBuilder {

	@Override
	public Car build() {
		Engine engine = getEngine();
		Underpan underpan = getUnderpan();
		Wheel wheel = getWheel();
		Car bmwCar = new BmwCar(engine, underpan, wheel);
		return bmwCar;
	}

}
