package designpattern.factory.dao;

public interface ContactDAO {

	public void save(ContactModel contactModel);

	public void delete(ContactModel contactModel);

	public ContactModel getById(Long id);

}
