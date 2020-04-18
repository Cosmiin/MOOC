package week3;

import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {
        System.out.println("type one word");
        Scanner reader = new Scanner(System.in);
        String word1 = reader.next();
        System.out.println("Type a second word");
        String word2 = reader.next();

        insideWord(word1,word2);
    }

    public static void insideWord(String wordOne, String wordTwo) {

        if (wordOne.indexOf(wordTwo) != -1) {
            System.out.println("The word " + wordTwo + " is found in the word" + wordOne);
        } else {
            System.out.println("The word " + wordTwo + " is not found in the word" + wordOne);
        }
    }
}



