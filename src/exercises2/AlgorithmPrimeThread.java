package exercises2;

import java.util.Set;

/**
 * Created by Administrator on 12/17/2015.
 * Use the The Sieve of Eratosthenes algorithm to find prime
 */
public class AlgorithmPrimeThread implements Runnable {
    private int currentPosition;
    private int maximum;
    private int[] numberList;
    private Set<Integer> result;

    public AlgorithmPrimeThread(int currentPosition, int maximum, int[] numberList, Set<Integer> result) {
        this.currentPosition = currentPosition;
        this.maximum = maximum;
        this.numberList = numberList;
        this.result = result;
    }

    @Override
    public void run() {
        result.add(numberList[currentPosition]);
        for(int j = 2 * numberList[currentPosition] - 2; j < maximum - 1; j+= numberList[currentPosition]) {
            numberList[j] = -1;
        }
    }
}
