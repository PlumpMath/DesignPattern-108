package com.demo.designpattern.builder;

import com.demo.car.Car;
import com.demo.car.CarBuilder;
import com.demo.car.Engine;
import com.demo.car.Underpan;
import com.demo.car.Wheel;
import com.demo.car.byd.BydCarBuilder;
import com.demo.car.byd.BydEngine;
import com.demo.car.byd.BydUnderpan;
import com.demo.car.byd.BydWheel;

public class BuilderTest {

	public static void main(String[] args) {
		Engine bydEngine = new BydEngine();
		Underpan bydUnderpan = new BydUnderpan();
		Wheel bydWheel = new BydWheel();
		CarBuilder bydCarBuilder = new BydCarBuilder();
		bydCarBuilder.setEngine(bydEngine);
		bydCarBuilder.setUnderpan(bydUnderpan);
		bydCarBuilder.setWheel(bydWheel);
		Car car = bydCarBuilder.build();
	}

}
