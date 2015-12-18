package exercises1;

import java.util.Scanner;

/**
 * Created by Administrator on 12/16/2015.
 */
public class Rectangle implements Shape {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the details of rectangle");
        System.out.println("Please input the height");
        height = scanner.nextDouble();
        System.out.println("Please input the width");
        width = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return String.format("<Rectangle>:<%.3f>",this.getArea());

    }
}
