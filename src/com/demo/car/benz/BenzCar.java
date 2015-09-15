package com.demo.car.benz;

import com.demo.car.AbstractCar;
import com.demo.car.Car;
import com.demo.car.Engine;
import com.demo.car.Underpan;
import com.demo.car.Wheel;

class BenzCar extends AbstractCar implements Car {

	public BenzCar(Engine engine, Underpan underpan, Wheel wheel) {
		super(engine, underpan, wheel);
	}

	@Override
	public void run() {
		getWheel().inflate();
		getUnderpan().up();
		getUnderpan().up();
		getEngine().start();

		// ....
	}

}
