package Factory.AbstractFactory;

public class VehicleTypeFactory {
    public VehicleFactory getVehicleFactory(String s){
        return switch (s) {
            case "Luxary" -> new LuxaryVehicleFactory();
            case "Normal" -> new NormalVehicleFactory();
            default -> null;
        };
    }
}
