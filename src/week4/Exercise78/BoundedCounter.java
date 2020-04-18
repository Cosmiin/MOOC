package week4.Exercise78;

public class BoundedCounter {
    private int value;
    private int upperLimit;
    int hvalue;

    public BoundedCounter(int value, int upperLimit) {
        this.value = value;
        this.upperLimit = upperLimit;
        hvalue=value;
    }

        @Override
    public String toString() {
        return "value: " + value +
                " upperLimit=" + upperLimit;
    }

    public void next() {
        value++;
        if(value>upperLimit){
            value=hvalue;
        }
    }
}
