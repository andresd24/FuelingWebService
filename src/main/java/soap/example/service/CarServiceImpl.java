package soap.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import soap.example.model.Car;
import soap.example.repository.CarRepository;

@Service("carService")
@Repository
@Transactional
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	public Car findById(Long carId) {
		return carRepository.findOne(carId);
	}

	public Car save(Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	public Car delete(Long carId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Car update(Long carId, Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateFuelLevel(Long carId, Long fuelLevel) {
		Car car = carRepository.findOne(carId);
		if(car!=null){
			car.setFuelLevel(fuelLevel);		
			carRepository.save(car);
		}
	}

}
