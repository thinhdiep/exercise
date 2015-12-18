package exercises1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 12/16/2015.
 */
public class Main {
    private ArrayList<Shape> shapeList;
    private Scanner scanner;

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void printShapeList() {
        if (shapeList.isEmpty()) {
            System.out.println("There are no shapes in the list");
        } else {
            for (Shape s : shapeList) {
                System.out.println(s.toString());
            }
        }
    }

    public double sumArea() {
        double sum = 0;
        if (!shapeList.isEmpty()) {
            for (Shape s : shapeList) {
                if (s.getArea()>0 && Double.isNaN(s.getArea())) {
                    sum+= s.getArea();
                }
            }
        }
        return sum;
    }

    public Shape getSmallest() {
        if (shapeList.isEmpty()) {
            System.out.println("there are no smallest shape");
            return null;
        } else {
            Shape smallest = shapeList.get(0);
            for (Shape s : shapeList) {
                if (s.getArea() < smallest.getArea()){
                    smallest = s;
                }
            }
            return smallest;
        }
    }

    public void inputShape() {
        Boolean yesFlag = true;
        while (yesFlag) {
            while (yesFlag) {
                System.out.println("Please choose the shape to input");
                System.out.println("Press 1 to choose Triangle ");
                System.out.println("Press 2 to choose Rectangle ");
                System.out.println("Press 3 to choose Square ");
                System.out.println("Press 4 to choose Circle ");
                System.out.println("Press any key else to exit");
                String input = scanner.next();
                switch (input) {
                    case "1":
                        shapeList.add(ShapeFactory.createShape(Shape.TRIANGLE));
                        break;
                    case "2":
                        shapeList.add(ShapeFactory.createShape(Shape.RECTANGLE));
                        break;
                    case "3":
                        shapeList.add(ShapeFactory.createShape(Shape.SQUARE));
                        break;
                    case "4":
                        shapeList.add(ShapeFactory.createShape(Shape.CIRCLE));
                        break;
                    default:
                        yesFlag = false;
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.shapeList = new ArrayList<Shape>();
        main.scanner = new Scanner(System.in);
        main.inputShape();
        if (!main.shapeList.isEmpty()) {
            System.out.println("The final list of shape is :");
            main.printShapeList();
            System.out.printf("Total area of shapes is: %.3f ", main.sumArea());
            System.out.println();
            System.out.println("The smallest shape is:" + main.getSmallest().toString());
        } else {
            System.out.println("you did not input any shape");
        }

    }
}
