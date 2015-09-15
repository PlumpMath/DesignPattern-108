package designpattern.car.bmw;

import designpattern.car.Car;
import designpattern.car.CarBuilder;
import designpattern.car.CarFactocy;
import designpattern.car.Engine;
import designpattern.car.Underpan;
import designpattern.car.Wheel;

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
