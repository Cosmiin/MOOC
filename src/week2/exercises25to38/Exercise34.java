package week2.exercises25to38;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int x = 1;
        int factorial = 1;
        while (x<=num){
            factorial*=x;
            x++;
        }
        System.out.println(factorial);
    }

}
