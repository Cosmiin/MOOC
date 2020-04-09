package week1;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = reader.nextInt();
        System.out.println("Enter another number: ");
        int b = reader.nextInt();
        System.out.printf("The bigger number of the two numbers given was: "+ Math.max(a,b));



    }
}
