package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) {
        ArrayList<String> listaCuvinte = new ArrayList<String>();
        boolean i = true;
        Scanner reader = new Scanner(System.in);

        while (i == true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (listaCuvinte.contains(word) == false) {
                listaCuvinte.add(word);

            } else {
                i = false;
                System.out.println("You gave the word " + word + " twice");
            }
        }

    }
}