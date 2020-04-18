package week4.Exercise78;

public class Main {

    public static void main(String[] args) {
        BoundedCounter counter = new BoundedCounter(0,4);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 10) {
            counter.next();
            System.out.println(counter );
            i++;
        }
    }
}
