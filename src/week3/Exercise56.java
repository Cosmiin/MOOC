package week3;

import java.util.Scanner;

public class Exercise56 {
    public static void main(String[] args) {
        System.out.print("Type in your text: ");
        Scanner reader =new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));

    }

    public static String reverse (String text){
        String help ="";
        for (int i = text.length()-1;i!=-1; i--) {
            help=help+text.charAt(i);
                    }
    return help;
    }
}
