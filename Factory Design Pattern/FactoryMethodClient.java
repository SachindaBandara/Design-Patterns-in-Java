public class FactoryMethodClient {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call its draw method.
        Shape shape = shapeFactory.getShape("square");

        // call draw method of Circle
        shape.draw();

    }
}
