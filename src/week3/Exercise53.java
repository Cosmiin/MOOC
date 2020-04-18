package week3;

import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        System.out.println("Type the lenght of the first part");
        int firstParts = reader.nextInt();
        firstParts(name,firstParts);
    }
    public static void firstParts (String name, int firstPart) {

        System.out.println(name.substring(0,firstPart));
        }
    }

