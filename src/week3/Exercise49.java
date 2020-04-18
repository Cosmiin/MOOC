package week3;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        System.out.println("Type a name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        System.out.println("Last character :"+lastCharacter(name));

    }
    public static char lastCharacter (String name){
        char name1 =name.charAt(calculateCharacters(name)-1);

        return name1;
    }
    public static int calculateCharacters (String name){
        int name1=name.length();

        return name1 ;
    }
}


