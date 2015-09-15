package com.demo.car.dao;

public class CarOracleDAOFactocy implements CarDAOFactocy {

	@Override
	public CarDAO createCarDAO() {
		return new CarOracleDAO();
	}

}
