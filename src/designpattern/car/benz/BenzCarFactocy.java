package designpattern.car.benz;

import designpattern.car.Car;
import designpattern.car.CarBuilder;
import designpattern.car.CarFactocy;
import designpattern.car.Engine;
import designpattern.car.Underpan;
import designpattern.car.Wheel;

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
