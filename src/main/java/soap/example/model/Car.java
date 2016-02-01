package soap.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	@Id
	@Column(name="CAR_ID")
    @GeneratedValue
	private Long id;
	
	@Column(name="CAR_MODEL")
	private String model;
	
	@Column(name="FUEL_LEVEL")
	private Long fuelLevel;
	
	public Car(){}
	
	public Car(Long carId, String model, Long fuelLevel) {
		super();
		id = carId;
		this.model = model;
		this.fuelLevel = fuelLevel;
	}
	
	public Long getCarId() {
		return id;
	}
	public void setCarId(Long carId) {
		id = carId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(Long fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	

}
