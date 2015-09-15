package com.demo.car.dao;

class CarMySQLDAO implements CarDAO {

	@Override
	public void save(CarModel carModel) {
		// Save
	}

	@Override
	public void delete(CarModel carModel) {
		// Delete
	}

	@Override
	public CarModel getById(Long id) {
		return new CarModel();
	}

}
