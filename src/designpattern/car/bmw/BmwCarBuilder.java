package designpattern.car.bmw;

import designpattern.car.AbstractCarBuilder;
import designpattern.car.Car;
import designpattern.car.CarBuilder;
import designpattern.car.Engine;
import designpattern.car.Underpan;
import designpattern.car.Wheel;

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
