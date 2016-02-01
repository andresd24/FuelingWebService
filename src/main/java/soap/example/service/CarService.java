package soap.example.service;

import java.util.List;

import soap.example.model.Car;

public interface CarService {
	
	public Car findById(Long carId);

	public Car save(Car car);

	public Car delete(Long carId);
	
	public Car update(Long carId, Car car);
	
	public List<Car> findAll();
	
	public void updateFuelLevel(Long carId, Long fuelLevel);
}
