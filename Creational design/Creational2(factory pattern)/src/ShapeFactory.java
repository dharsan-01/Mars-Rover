// Factory class responsible for creating different shapes based on input
public class ShapeFactory {
    // Method to get the required shape based on the provided shapeType
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        // Returning the appropriate shape object
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
