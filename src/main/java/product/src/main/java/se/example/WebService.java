package product.src.main.java.se.example;

import javax.xml.ws.Endpoint;

import org.springframework.context.support.GenericXmlApplicationContext;

import soap.example.service.CarService;

public class WebService {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	
    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    	ctx.load("classpath:spring.xml");
    	ctx.refresh();
    	
    	CarService carService = ctx.getBean("carService", CarService.class);
    	
        Endpoint.publish("http://localhost:8090/car", new Car(carService));
    }
}