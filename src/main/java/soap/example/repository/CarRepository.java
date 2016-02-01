package soap.example.repository;

import org.springframework.data.repository.CrudRepository;

import soap.example.model.Car;

public interface CarRepository extends CrudRepository<Car, Long> {

}
