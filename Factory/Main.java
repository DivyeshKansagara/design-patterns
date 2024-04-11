package Factory;

import Factory.AbstractFactory.VehicleTypeFactory;
import Factory.Factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("SQUARE").draw();


        VehicleTypeFactory vehicleTypeFactory = new VehicleTypeFactory();
        int average = vehicleTypeFactory.getVehicleFactory("Normal").getVehicle("Swift").average();
        int average2 = vehicleTypeFactory.getVehicleFactory("Luxary").getVehicle("BMW").average();
        System.out.println(average+" "+average2);
    }
}
