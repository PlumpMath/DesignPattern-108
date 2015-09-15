package designpattern.car.dao;

public interface CarDAO {

	public void save(CarModel carModel);

	public void delete(CarModel carModel);

	public CarModel getById(Long id);

}
