package com.demo.car.bmw;

import com.demo.car.Car;
import com.demo.car.CarBuilder;
import com.demo.car.CarFactocy;
import com.demo.car.Engine;
import com.demo.car.Underpan;
import com.demo.car.Wheel;

public class BmwCarFactocy implements CarFactocy {

	@Override
	public Car createCar() {
		Engine bmwEngine = new BmwEngine();
		Underpan bmwUnderpan = new BmwUnderpan();
		Wheel bmwWheel = new BmwWheel();
		// ....
		Car bmwCar = new BmwCar(bmwEngine, bmwUnderpan, bmwWheel);

		// Builder Pattern.
		CarBuilder bmwCarBuilder = new BmwCarBuilder();
		bmwCarBuilder.setEngine(bmwEngine);
		bmwCarBuilder.setUnderpan(bmwUnderpan);
		bmwCarBuilder.setWheel(bmwWheel);
		Car car = bmwCarBuilder.build();

		return bmwCar;
	}

}
