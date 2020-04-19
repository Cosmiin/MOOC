package week4.Exercise78;

public class Main78dot5 {
    public static void main(String[] args) throws InterruptedException {

        BoundedCounter seconds = new BoundedCounter(0,59);
        BoundedCounter minutes = new BoundedCounter(0,59);
        BoundedCounter hours = new BoundedCounter(0,23);

        System.out.print("seconds: ");
        int s =50;
        System.out.print("minutes: ");
        int m = 59;
        System.out.print("hours: ");
        int h = 23;

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
            while ( true ) {
                System.out.println( hours + ":" + minutes+":"+seconds);
                 Thread.sleep(1000);
                seconds.next();
                if(seconds.getValue()==0){
                    minutes.next();
                }
                if (minutes.getValue()==0&&seconds.getValue()==0) {
                    hours.next();
                }
            }
        }
    }






