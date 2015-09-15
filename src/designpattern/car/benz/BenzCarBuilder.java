package designpattern.car.benz;

import designpattern.car.AbstractCarBuilder;
import designpattern.car.Car;
import designpattern.car.CarBuilder;
import designpattern.car.Engine;
import designpattern.car.Underpan;
import designpattern.car.Wheel;

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
