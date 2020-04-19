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
        if (value<=9)
        {
            return "0"+ value;


    }
            return "" + value;
    }

    public void next() {
        value++;

        if(value>upperLimit){
            value=hvalue;
        }

    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
