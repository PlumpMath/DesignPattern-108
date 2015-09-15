package com.demo.car.dao;

public class CarSQLServerDAOFactocy implements CarDAOFactocy {

	@Override
	public CarDAO createCarDAO() {
		return new CarSQLServerDAO();
	}

}
