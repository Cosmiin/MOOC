package week1;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = reader.nextInt();
        if (age < 0 || age > 120|| age == 0) {
            System.out.println("Impossible");
        } else {
            System.out.println("You're ok.");
        }

    }
}
