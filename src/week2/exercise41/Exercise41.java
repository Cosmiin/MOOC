package week2.exercise41;

import java.util.Random;
import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        int x = drawNumber();
         Scanner reader = new Scanner(System.in);
        System.out.println("Guess a number");
        int input = reader.nextInt();


        if(x==input){
            System.out.println("Congratulations, your guess is correct");
        } else if(input<x) {
            System.out.println("The number is greater");
        } else {
            System.out.println("The number is lesser");
        }
    }
    public static int drawNumber (){
        Random random1 = new Random();
        int randomnum= random1.nextInt(101);

        return randomnum;
    }
}
