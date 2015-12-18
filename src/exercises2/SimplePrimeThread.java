package exercises2;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 12/17/2015.
 */
public class SimplePrimeThread implements Runnable {
    private int inputNumber;
    private int primeNumber;
    private List<Integer> resultList;
    private int startNumber;
    private int endNumber;


    public SimplePrimeThread(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public SimplePrimeThread(int startNumber, int endNumber, List<Integer> resultList) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.resultList = resultList;
    }

    @Override
    public void run() {


//        for (int i = 2; i < inputNumber; i++) {
//            if(inputNumber % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
//
//        if (isPrime) {
//            primeNumber = inputNumber;
//            resultList.add(primeNumber);
//        } else {
//            primeNumber = 0;
//        }
        for (int i = startNumber; i <= endNumber; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
            resultList.add(i);
        }

        }
    }

    public int getPrime() {
        return primeNumber;
    }
}
