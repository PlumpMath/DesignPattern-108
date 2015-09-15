package com.demo.designpattern.factory;

import com.demo.car.Car;
import com.demo.car.CarFactocy;
import com.demo.car.benz.BenzCarFactocy;


public class CarFactocyTest {

	public static void main(String[] args) {
		CarFactocy carFactocy = new BenzCarFactocy();
		Car car = carFactocy.createCar();
		car.run();
	}

}
