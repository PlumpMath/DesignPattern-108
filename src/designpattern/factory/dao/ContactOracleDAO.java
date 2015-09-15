package designpattern.factory.dao;

class ContactOracleDAO implements ContactDAO {

	@Override
	public void save(ContactModel contactModel) {
		// Save
	}

	@Override
	public void delete(ContactModel contactModel) {
		// Delete
	}

	@Override
	public ContactModel getById(Long id) {
		return new ContactModel();
	}

}
