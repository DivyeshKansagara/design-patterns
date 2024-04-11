package Factory.AbstractFactory;

public class NormalVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String s) {
        return switch (s) {
            case "Swift" -> new Swift();
            case "Hyundai" -> new Hyundai();
            default -> null;
        };
    }
}
