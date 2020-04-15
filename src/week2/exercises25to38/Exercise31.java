package week2.exercises25to38;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        System.out.println("First: ");
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        System.out.println("Second: ");
        int y = reader.nextInt();
         while (x<=y){
        System.out.println(x);
            x++;
        }
    }
}
