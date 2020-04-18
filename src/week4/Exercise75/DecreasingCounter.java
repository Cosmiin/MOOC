package week4.Exercise75;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    int hValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        hValue=valueAtStart;

    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
            value = value - 1;
        }
    }

    public void reset(){
        value =0;
    }

    public void setInitial(){
        value =hValue;
    }
}

