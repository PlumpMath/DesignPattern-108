package com.demo.car.dao;

public class SimpleCarDAOFactory {

	public static CarDAO createCarDAO(CarDAOType carDAOType) {
		CarDAO carDAO;

		if (CarDAOType.CarOracleDAO == carDAOType) {
			carDAO = new CarOracleDAO();
		} else if (CarDAOType.CarMySQLDAO == carDAOType) {
			carDAO = new CarMySQLDAO();
		} else {
			carDAO = null;
		}

		return carDAO;
	}

}
