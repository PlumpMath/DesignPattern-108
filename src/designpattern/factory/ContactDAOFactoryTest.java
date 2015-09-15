package designpattern.factory;

import designpattern.factory.dao.ContactDAO;
import designpattern.factory.dao.ContactModel;
import designpattern.factory.dao.ContactOracleDAOFactocy;
import designpattern.factory.dao.SimpleContactDAOFactory;

public class ContactDAOFactoryTest {

	public static void main(String[] args) {
		ContactModel contactModel = new ContactModel();
		Long id = new Long(10001);
		contactModel.setId(id);
		contactModel.setFirstName("Waikei");
		contactModel.setMiddleName("C");
		contactModel.setLastName("Tam");

		String type = "MySQL";
		ContactDAO simpleContactDAO = SimpleContactDAOFactory
				.createDatabaseDAO(type);

		ContactModel dbContactModel = simpleContactDAO.getById(id);

		if (dbContactModel == null) {
			simpleContactDAO.save(contactModel);
		}

		ContactOracleDAOFactocy contactOracleDAOFactocy = new ContactOracleDAOFactocy();
		ContactDAO contactDAO = contactOracleDAOFactocy.createContactDAO();

		contactDAO.save(contactModel);
		contactDAO.delete(contactModel);

	}

}
