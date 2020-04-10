package week1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How are you?");
        int age = reader.nextInt();

        if(age<18){
            System.out.println("You have not reached the age of majority yet. Fuck off");

        }
        else {
            System.out.println("You have reached the age of majority. Fuckk off");
        }
    }
}
