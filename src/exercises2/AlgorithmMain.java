package exercises2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 12/17/2015.
 */
public class AlgorithmMain {

    public static Set<Integer> findPrimes(int n) {
        int[] numberList = new int[n -1];
        Set<Integer> result = new TreeSet<>();

        // Add number from 2 to n to the numberList
        for (int i = 0; i < n -1; i++) {
            numberList[i] = i + 2;
        }

        // Call a Thread for each loop to add prime to result
        for (int i = 0; i < n-1; i++) {
            if (numberList[i] != -1) {
                AlgorithmPrimeThread thread = new AlgorithmPrimeThread(i, n, numberList, result);
                thread.run();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Please input the maximum number ");

        Scanner scanner = new Scanner(System.in);
        int maximum = scanner.nextInt();
        Set<Integer> result = AlgorithmMain.findPrimes(maximum);
        System.out.printf("The list of prime from 2 to %d is :", maximum);
        System.out.println(result.toString());
    }

}
