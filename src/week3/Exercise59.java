package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> listaCuvinte = new ArrayList<String>();
        boolean j = true;
        while (true) {
            System.out.println("Type a word");
            String text = reader.nextLine();
            listaCuvinte.add(text);

            if (text.isEmpty()) {
                System.out.println("You typed the following words");
                for (int i = listaCuvinte.size() - 1; i >= 0; i--) {
                    System.out.println(listaCuvinte.get(i));
                }
            }
        }
    }
}
