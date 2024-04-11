package DecoratorPattern;

import Factory.AbstractFactory.VehicleTypeFactory;
import Factory.Factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        // when use decorator
        BasePizza pizza = new ExtraCheeze(new Mushroom(new FarmHouse()));
        System.out.println(pizza.cost());


    }
}
