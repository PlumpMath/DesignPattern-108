package designpattern.factory;

import designpattern.car.Car;
import designpattern.car.CarFactocy;
import designpattern.car.benz.BenzCarFactocy;

public class CarFactocyTest {

	public static void main(String[] args) {
		CarFactocy carFactocy = new BenzCarFactocy();
		Car car = carFactocy.createCar();
		car.run();
	}

}
