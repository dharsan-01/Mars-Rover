public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Creating a factory instance to create shapes
        ShapeFactory shapeFactory = new ShapeFactory();

        // Requesting a Circle from the factory
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // Drawing the circle
        shape1.draw();

        // Requesting a Square from the factory
        Shape shape2 = shapeFactory.getShape("SQUARE");
        // Drawing the square
        shape2.draw();
    }
}
