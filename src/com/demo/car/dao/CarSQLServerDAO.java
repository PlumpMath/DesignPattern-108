package com.demo.car.dao;

class CarSQLServerDAO implements CarDAO {

	@Override
	public void save(CarModel carModel) {
		// Save
	}

	@Override
	public void delete(CarModel car) {
		// Delete
	}

	@Override
	public CarModel getById(Long id) {
		return new CarModel();
	}

}
