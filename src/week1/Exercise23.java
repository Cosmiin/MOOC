package week1;

import libs.Graph;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number");
            double num = reader.nextDouble();
            if(num>-30&&num<40) {
                Graph.addNumber(num);
            }
        }
    }
}