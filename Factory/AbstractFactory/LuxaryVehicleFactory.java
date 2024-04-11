package Factory.AbstractFactory;

import Factory.Factory.Circle;
import Factory.Factory.Rectangle;
import Factory.Factory.Square;

public class LuxaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String s) {
        return switch (s) {
            case "BMW" -> new BMW();
            case "Mercedes" -> new Mercedes();
            default -> null;
        };
    }
}
