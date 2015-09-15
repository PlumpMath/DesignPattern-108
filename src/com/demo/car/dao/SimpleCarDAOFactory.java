package com.demo.car.dao;

public class SimpleCarDAOFactory {

	public static CarDAO createCarDAO(String type) {
		CarDAO carDAO;

		if (type.equals("Oracle")) {
			carDAO = new CarOracleDAO();
		} else if (type.equals("MySQL")) {
			carDAO = new CarMySQLDAO();
		} else {
			carDAO = null;
		}

		return carDAO;
	}

}
