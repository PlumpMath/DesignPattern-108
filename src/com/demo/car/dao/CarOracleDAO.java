package com.demo.car.dao;

class CarOracleDAO implements CarDAO {

	@Override
	public void save(CarModel contactModel) {
		// Save
	}

	@Override
	public void delete(CarModel contactModel) {
		// Delete
	}

	@Override
	public CarModel getById(Long id) {
		return new CarModel();
	}

}
