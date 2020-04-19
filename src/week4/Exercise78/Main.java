package week4.Exercise78;

public class Main {

    public static void main(String[] args) {
        //BoundedCounter counter = new BoundedCounter(0,13);
        //BoundedCounter counter = new BoundedCounter(0,13);
        BoundedCounter minutes = new BoundedCounter(0,59);
        BoundedCounter hours = new BoundedCounter(0,23);

        int i = 0;
        while ( i < 1567 ) {
            // the current time printed
            minutes.next();
            if (minutes.getValue()==0) {
                hours.next();
            }
           i++;
            System.out.println( hours + ":" + minutes);
        }
//        int i = 0;
//        while ( i < 17) {
//            counter.next();
//            System.out.println(counter );
//            i++;
        }
    }

