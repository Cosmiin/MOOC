package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        boolean x = true;
        while (x == true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                x = false;
            } else {
                words.add(word);
            }
        }
        System.out.println("You typed the following words: ");
        for (int i = 0; i < words.size() - 1; i++) {
            System.out.println(words.get(i));
        }
    }


}

