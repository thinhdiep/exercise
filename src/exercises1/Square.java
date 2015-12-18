package exercises1;

import java.util.Scanner;

/**
 * Created by Administrator on 12/16/2015.
 */
public class Square implements Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the details of square");
        System.out.println("Please input the side ");
        side = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return String.format("<Square>:<%.3f>", this.getArea());

    }
}
