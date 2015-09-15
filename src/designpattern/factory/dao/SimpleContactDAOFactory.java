package designpattern.factory.dao;

public class SimpleContactDAOFactory {

	public static ContactDAO createDatabaseDAO(String type) {
		ContactDAO databaseDAO;

		if (type.equals("Oracle")) {
			databaseDAO = new ContactOracleDAO();
		} else if (type.equals("MySQL")) {
			databaseDAO = new ContactMySQLDAO();
		} else {
			databaseDAO = null;
		}

		return databaseDAO;
	}
}
