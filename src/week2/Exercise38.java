package week2;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int x = 0;
        while (x<num){
            printText();
            x++;

        }

    }

    //self written methods
    public static void printText(){
        System.out.println("\"In the beginning there were the swamp, the hoe and Java.\"");
    }
}


