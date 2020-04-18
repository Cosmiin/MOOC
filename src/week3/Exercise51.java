package week3;

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        separateCharacters(name);
        System.out.println("Second method");
        separateCharacters2(name);
    }

    public static void separateCharacters(String name){
        int nameLenght = name.length();
        for (int i = 0; i <nameLenght; i++) {
            System.out.println(name.charAt(i));
        }
    }
    public static void separateCharacters2 (String name){
        int nameLenght = name.length();
        int counter =0;
        while (counter<nameLenght){
            System.out.println(name.charAt(counter));
            counter++;
        }
    }
}
