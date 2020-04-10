package week1;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a fucking grade");
        int point = reader.nextInt();

        if (point < 0 || point > 60) {
            System.out.println("You are too stupid or too smart");
        } else if (point > 0 && point <= 29) {
            System.out.println("You failed");
        } else if (point > 29 && point <= 34) {
            System.out.println("You got grade 1");
        } else if (point > 34 && point <= 39) {
            System.out.println("You got grade 2");
        } else if (point > 39 && point <= 44) {
            System.out.println("You got grade 3");
        } else if (point > 44 && point <= 49) {
            System.out.println("You got grade 4");
        } else if (point > 49 && point <= 60) {
            System.out.println("You got grade 5");
        }
    }
}


