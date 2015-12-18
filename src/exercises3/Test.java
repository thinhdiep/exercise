package exercises3;

import java.math.BigDecimal;

/**
 * Created by Administrator on 12/17/2015.
 */
public class Test {

//    public static double showPi(int n){
//        if(n == 0){
//            return 1;
//        } else {
//            return Math.pow(-1,n)/(2*n +1) + showPi(n-1);
//        }
//    }

    public static void main(String[] args){
//        System.out.println("the Pi number is " + Math.PI/4);
//        System.out.println("the Pi number is " + Math.PI);
//        System.out.println("the Pi number is " + Math.PI/4 * 4);
//        double a = 1;
//        double b = 3;
//        double c = a/b;
//        double e = 0.333333333333333;
//        Double truncated = new BigDecimal(c).setScale(15, BigDecimal.ROUND_HALF_UP).doubleValue();
//
//        System.out.printf("Use the double %.15f", c);
//
//        ModernComparator mo = new DoubleComparator(6.2, 6.21, 90);
//        System.out.println("equals ? " + mo.compareNumber());
        double result = 0;
        int position = 0;
        boolean found = false;
        while (!found){
            CheckPiThread thread = new CheckPiThread(result,position);
            thread.run();
            result = thread.getResult();

            found = thread.isFound();
            position++;

        }
        System.out.println("The final result is :" + result *4);
        System.out.println("The expected result is : " + Math.PI);


    }
}
