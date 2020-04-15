package week1.exercises1to24;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number");
        int num1 = reader.nextInt();
        System.out.println("Type a number 2");
        int num2 = reader.nextInt();
        if (num1 != num2) {
            System.out.println("The greater number is: "+Math.max(num1, num2));

        } else {
            System.out.println("The numbers are equal");
        }


    }

}
