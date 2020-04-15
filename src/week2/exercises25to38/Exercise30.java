package week2.exercises25to38;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        System.out.println("Up to what number?");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}

