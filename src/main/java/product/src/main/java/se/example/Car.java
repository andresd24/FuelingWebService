package product.src.main.java.se.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import soap.example.service.CarService;

import java.util.Date;

@SOAPBinding(style = Style.DOCUMENT)
@WebService
public class Car {
	private CarService carService;

	public Car(CarService carService) {
		this.carService = carService;
	}

	@WebMethod
	public void addFuel(Long carId, Long addedAmount) {
		String message = "adding " + addedAmount;
		usageLog(message);
		carService.updateFuelLevel(carId, addedAmount);
	}

	@WebMethod
	public Long getFuelLevel(Long carId) {
		String message = "returning fuel level for car" + carId;
		usageLog(message);
		if (carId != null) {
			soap.example.model.Car car = carService.findById(carId);
			return car.getFuelLevel();
		} else {
			return null;
		}
	}

	@WebMethod
	public void emptyFuel(Long carId) {
		String message = "Emptying fuel tank";
		usageLog(message);
		if (carId != null) {
			carService.updateFuelLevel(carId, 0L);
		}
	}

	private void usageLog(String message) {
		Date now = new Date();
		System.out.println(now + " " + message);
	}
}
