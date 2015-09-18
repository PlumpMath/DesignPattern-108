package com.demo.car.dao;

public class SimpleCarDAOFactory {

	public static CarDAO createCarDAO(DatabaseType databaseType) {
		CarDAO carDAO;

		if (DatabaseType.Oracle == databaseType) {
			carDAO = new CarOracleDAO();
		} else if (DatabaseType.MySQL == databaseType) {
			carDAO = new CarMySQLDAO();
		} else {
			carDAO = null;
		}

		return carDAO;
	}

}
