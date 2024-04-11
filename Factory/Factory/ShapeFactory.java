package Factory.Factory;

public class ShapeFactory {
    public Shape getShape(String shape){
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };

    }
}
