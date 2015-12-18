package exercises1;

import java.util.Scanner;

/**
 * Created by Administrator on 12/16/2015.
 */
public class Circle implements Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the details of circle");
        System.out.println("Please input the radius ");
        radius = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return String.format("<Circle>:<%.3f>", this.getArea());

    }

}
