package designpattern.factory.dao;

public class ContactSQLServerDAOFactocy implements ContactDAOFactocy {

	@Override
	public ContactDAO createContactDAO() {
		return new ContactSQLServerDAO();
	}

}
