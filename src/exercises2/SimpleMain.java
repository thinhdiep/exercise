package exercises2;

import java.util.*;

/**
 * Created by Administrator on 12/17/2015.
 */
public class SimpleMain {

    public static void main(String[] args) {
        System.out.println("Please input the number :");
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        int n = scanner.nextInt();

        int threadNumber = 8;
        int startNumber = 2;
        ArrayList<Thread> listThread = new ArrayList<>();
        int endNumber = startNumber + (n - 2)/threadNumber;
        for (int i = 0; i < threadNumber; i++ ) {
            Thread t = new Thread(new SimplePrimeThread(startNumber, endNumber, result));

            listThread.add(t);
            t.start();
            System.out.println("mmmmm");
            startNumber = endNumber ;
            endNumber = (endNumber + (n - 2)/threadNumber) > n ? n : (endNumber + (n - 2)/threadNumber);
        }

        for (int i = 0; i< listThread.size(); i++) {
            try {
                listThread.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        Thread t = new Thread(new SimplePrimeThread(2,n,result));
//        t.start();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


//        for (int i = 2; i <= n; i++) {
//            SimplePrimeThread thread = new SimplePrimeThread(i);
//            thread.run();
//            if (thread.getPrime() != 0) {
//                result.add(thread.getPrime());
//            }
//            Thread t = new Thread(new SimplePrimeThread(i, result));
//            t.start();
//        }


        System.out.printf("The list of prime from 2 to %d is :", n);
        System.out.println(result.toString());
        scanner.close();
    }
}
