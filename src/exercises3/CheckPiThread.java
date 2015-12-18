package exercises3;

/**
 * Created by Administrator on 12/17/2015.
 */
public class CheckPiThread implements Runnable {
    private double result;
    private int position;
    private boolean found;

    public double getResult() {
        return result;
    }

    public boolean isFound() {
        return found;
    }

    public CheckPiThread(double result, int position) {
        this.result = result;
        this.position = position;
    }

    @Override
    public void run() {
        int flag = (position % 2 == 0) ? 1 : -1;
//        System.out.println("position " + position + "the flag is " + flag);
        result+= (double)flag/(2*position+1);
//        System.out.println(" true result is " + result);
        DoubleComparator doubleComparator = new DoubleComparator(result *4, Math.PI, 99.99999f);
        found = doubleComparator.compareNumber();
    }
}
