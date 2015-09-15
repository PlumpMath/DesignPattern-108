package designpattern.dao;

public class ContactOracleDAOFactocy implements ContactDAOFactocy {

	@Override
	public ContactDAO createContactDAO() {
		return new ContactOracleDAO();
	}

}
