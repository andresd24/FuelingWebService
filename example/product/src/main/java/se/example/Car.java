package product.src.main.java.se.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.Date;

@SOAPBinding(style = Style.DOCUMENT)
@WebService
public class Car {
    private Integer fuelLevel;

    public Car() {
        fuelLevel = 0;
    }

    @WebMethod
    public void addFuel(int addedAmount) {
        String message = "adding " + addedAmount;
        usageLog(message);
        fuelLevel = fuelLevel + addedAmount;
    }

    @WebMethod
    public Integer getFuelLevel() {
        String message = "returning fuel level " + fuelLevel;
        usageLog(message);
        return fuelLevel;
    }

    @WebMethod
    public void emptyFuel() {
        String message = "Emptying fuel tank";
        usageLog(message);
        fuelLevel = 0;
    }

    private void usageLog(String message) {
        Date now = new Date();
        System.out.println(now + " " + message);
    }
}
