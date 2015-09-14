package designpattern.factory.dao;

public class SimpleDatabaseDAOFactory {

	public static ContactDAO createDatabaseDAO(String databaseType) {
		ContactDAO databaseDAO;

		if (databaseType.equals("Oracle")) {
			databaseDAO = new ContactOracleDAO();
		} else if (databaseType.equals("MySQL")) {
			databaseDAO = new ContactMySQLDAO();
		} else {
			databaseDAO = null;
		}

		return databaseDAO;
	}
}
