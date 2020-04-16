package week3;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        System.out.println("Type a name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        System.out.println("First Character :"+firstCharacter(name));

    }
    public static char firstCharacter (String name){
        char name1 =name.charAt(0);

        return name1;
    }
}

}
