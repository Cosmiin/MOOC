package week1.exercises1to24;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
                System.out.println("Type a number");
        int number = reader.nextInt();

        if (number > 0) {
                    System.out.println("The number is positive");
        }            else if (number < 0) {
              System.out.println("The numner is negatibe");

        } else {
            System.out.println("The number is equal to 0");
        }
    }
}
