package com.demo.designpattern.factory;

import com.demo.car.dao.CarDAO;
import com.demo.car.dao.DatabaseType;
import com.demo.car.dao.CarModel;
import com.demo.car.dao.CarOracleDAOFactocy;
import com.demo.car.dao.SimpleCarDAOFactory;

public class CarDAOFactoryTest {

	public static void main(String[] args) {
		CarModel carModel = new CarModel();
		Long id = new Long(10001);
		carModel.setId(id);
		carModel.setPlateNumber("AAA1234");
		carModel.setEngineNumber("BMW1022111151");

		CarDAO simpleCarDAO = SimpleCarDAOFactory
				.createCarDAO(DatabaseType.Oracle);

		CarModel dbCarModel = simpleCarDAO.getById(id);

		if (dbCarModel == null) {
			simpleCarDAO.save(carModel);
		}

		CarOracleDAOFactocy carOracleDAOFactocy = new CarOracleDAOFactocy();
		CarDAO carDAO = carOracleDAOFactocy.createCarDAO();

		carDAO.save(carModel);
		carDAO.delete(carModel);
	}

}
