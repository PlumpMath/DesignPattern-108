package designpattern.car.dao;

public class CarSQLServerDAOFactocy implements CarDAOFactocy {

	@Override
	public CarDAO createCarDAO() {
		return new CarSQLServerDAO();
	}

}
