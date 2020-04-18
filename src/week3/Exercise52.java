package week3;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        reverseName(name);
    }
    public static void reverseName (String name){
            for (int i = name.length()-1; i!=-1; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
