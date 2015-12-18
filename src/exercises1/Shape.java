package exercises1;

/**
 * Created by Administrator on 12/16/2015.
 */
public abstract interface Shape {
    public static final String CIRCLE = "Circle";

    public static final String RECTANGLE = "Rectangle";

    public static final String SQUARE = "Square";

    public static final String TRIANGLE = "Triangle";

    public abstract  double getArea();

    public abstract void inputDetails();

}
