package exercises3;

/**
 * Created by Administrator on 12/17/2015.
 */
public class DoubleComparator implements ModernComparator {
    private double value1;
    private double value2;
    private float precision;

    public float getPrecision() {
        return precision;
    }

    public void setPrecision(float precision) {
        this.precision = precision;
    }

    public DoubleComparator(double value1, double value2, float precision) {
        this.value1 = value1;
        this.value2 = value2;
        this.precision = precision;
    }

    @Override
    public boolean compareNumber() {
        Double d;

        float theDifferent = Math.abs(100 - precision)/100;
        if(value1 == value2) {
            return  true;
        } else {
            if (Math.abs(value1 - value2) <= theDifferent) {
                return true;
            }
        }
        return false;
    }
}
