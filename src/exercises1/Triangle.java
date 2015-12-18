package exercises1;

import java.util.Scanner;

/**
 * Created by Administrator on 12/16/2015.
 */
public class Triangle implements Shape {
    private double aSide;
    private double bSide;
    private double cSide;

    public double getBSide() {
        return bSide;
    }

    public void setBSide(double bSide) {
        this.bSide = bSide;
    }

    public double getASide() {
        return aSide;
    }

    public void setASide(double aSide) {
        this.aSide = aSide;
    }

    public double getCSide() {
        return cSide;
    }

    public void setCSide(double cSide) {
        this.cSide = cSide;
    }

    @Override
    public double getArea() {
        double p = (aSide + bSide + cSide)/2;
        return Math.sqrt(p*(p-aSide)*(p-bSide)*(p-cSide));
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the details of triangle");
        System.out.println("Please input the a Side");
        aSide = scanner.nextDouble();
        System.out.println("Please input the b Side");
        bSide = scanner.nextDouble();
        System.out.println("Please input the c Side");
        cSide = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return String.format("<Triangle>:<%.3f>", this.getArea());

    }
}
