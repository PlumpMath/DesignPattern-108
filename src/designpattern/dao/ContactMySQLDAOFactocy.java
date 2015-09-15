package designpattern.dao;


public class ContactMySQLDAOFactocy implements ContactDAOFactocy {

	@Override
	public ContactDAO createContactDAO() {
		return new ContactMySQLDAO();
	}

}
