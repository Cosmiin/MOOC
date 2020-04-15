package week2.exercises25to38;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        System.out.println("Until what?");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int x =0;
        int sum = 0;
        while (x<=num){
          sum+=x;
          x++;

            }
        System.out.println(sum);
    }
}
