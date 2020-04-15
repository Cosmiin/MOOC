package week2.exercises25to38;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    int sum = 0;
    int read = 0;

        System.out.println("Type the first number");
        read=reader.nextInt();
        sum+=read;
        System.out.println("Type the second number");
        read=reader.nextInt();
        sum+=read;
        System.out.println("Type the third number");
        read=reader.nextInt();
        sum+=read;


System.out.println("Sum: " + sum);
}

}