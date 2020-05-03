package week5.Exercise84;

public class Counter {
    @Override
    public String toString() {
        return "Counter{" +
                "startingValue=" + startingValue +
                ", check=" + check +
                ", counter=" + counter +
                '}';
    }

    int startingValue;
    boolean check;
    int counter;

    public Counter(int startingValue, boolean check) {
        this.startingValue=startingValue  ;
        this.check=check;
        if ((check == true) && (startingValue < 0)) {
            counter = 0;
        } else {
            counter = startingValue;
        }
    }

    public Counter(int startingValue) {
        this.startingValue=startingValue;
        counter = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        startingValue =0;
        if(check==true){
            startingValue =0;
            counter =startingValue;
        }else {
           counter = startingValue;
        }
    }

    public Counter() {
        this.startingValue=0;
        counter= startingValue;
        }

    //methods

    public int value (){
        return counter;
    }

    public void increase (){
        counter++;
    }

    public void decrease (){
        counter--;
        if(counter<0){
            counter++;
        }
    }




}

