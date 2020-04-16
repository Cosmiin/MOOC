package week3;

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        System.out.println("Type a name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        System.out.println("Number of characters is :"+calculateCharacters(name));

    }
    public static int calculateCharacters (String name){
        int name1=name.length();

        return name1 ;
    }
}
