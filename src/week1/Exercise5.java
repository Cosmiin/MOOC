package week1;

public class Exercise5 {
    public static void main(String[] args) {
        int seconds =1;
        int minutes=60*seconds;
        int hours = 60*minutes;
        int days = 24*hours;
        int secondsInYear=365*days;

        System.out.println("There are "+ secondsInYear +" seconds in a year");
        System.out.printf("There are %d seconds in a year.",secondsInYear);

    }
}
