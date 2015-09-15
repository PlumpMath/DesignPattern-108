package com.demo.car.benz;

import com.demo.car.Car;
import com.demo.car.CarBuilder;
import com.demo.car.CarFactocy;
import com.demo.car.Engine;
import com.demo.car.Underpan;
import com.demo.car.Wheel;

public class BenzCarFactocy implements CarFactocy {

	@Override
	public Car createCar() {
		Engine benzEngine = new BenzEngine();
		Underpan benzUnderpan = new BenzUnderpan();
		Wheel benzWheel = new BenzWheel();
		// ....
		Car benzCar = new BenzCar(benzEngine, benzUnderpan, benzWheel);

		// Builder Pattern.
		CarBuilder benzCarBuilder = new BenzCarBuilder();
		benzCarBuilder.setEngine(benzEngine);
		benzCarBuilder.setUnderpan(benzUnderpan);
		benzCarBuilder.setWheel(benzWheel);
		Car car = benzCarBuilder.build();

		return benzCar;
	}

}
