package com.demo.car.dao;

public class CarMySQLDAOFactocy implements CarDAOFactocy {

	@Override
	public CarDAO createCarDAO() {
		return new CarMySQLDAO();
	}

}
