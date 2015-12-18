package exercises1;

/**
 * Created by Administrator on 12/16/2015.
 */
public class ShapeFactory {

    public static Shape createShape(String type) {
        switch (type) {
            case Shape.TRIANGLE:
                Triangle triangle = new Triangle();
                triangle.inputDetails();
                return triangle;
            case Shape.RECTANGLE:
                Rectangle rectangle = new Rectangle();
                rectangle.inputDetails();
                return  rectangle;
            case Shape.SQUARE:
                Square square = new Square();
                square.inputDetails();
                return  square;
            case Shape.CIRCLE:
                Circle circle = new Circle();
                circle.inputDetails();
                return circle;
            default:
                return null;
        }
    }
}
