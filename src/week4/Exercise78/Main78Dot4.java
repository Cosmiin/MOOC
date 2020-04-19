package week4.Exercise78;

import java.util.Scanner;

public class Main78Dot4 {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            BoundedCounter seconds = new BoundedCounter(0,59);
            BoundedCounter minutes = new BoundedCounter(0,59);
            BoundedCounter hours = new BoundedCounter(0,23);

            System.out.print("seconds: ");
            int s =reader.nextInt();
                    System.out.print("minutes: ");
            int m = reader.nextInt();
                    System.out.print("hours: ");
            int h = reader.nextInt();

            seconds.setValue(s);
            minutes.setValue(m);
            hours.setValue(h);

            int i = 0;
            while ( i < 15670 ) {
            seconds.next();
                if(seconds.getValue()==0){
                minutes.next();
                }
                if (minutes.getValue()==0&&seconds.getValue()==0) {
                    hours.next();
                }
                i++;
                System.out.println( hours + ":" + minutes+":"+seconds);
            }
//        int i = 0;
//        while ( i < 17) {
//            counter.next();
//            System.out.println(counter );
//            i++;
        }
    }




