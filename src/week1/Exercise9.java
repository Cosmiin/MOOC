package week1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = reader.nextInt();
        System.out.println("Enter another number: ");
        int b = reader.nextInt();
        double x = a/b;
        System.out.printf("Sum of the number: %d",x);

    }
}
