package week3;

import java.util.Scanner;

public class Exercise69 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
    public static boolean palindrome(String text) {
        String sPalindrome = reverse(text);
        boolean z = false;
        if (text.equalsIgnoreCase(sPalindrome)) {
            z = true;
        }
        return z;
    }
    public static String reverse(String text) {
        String help = "";
        for (int i = text.length() - 1; i != -1; i--) {
            help = help + text.charAt(i);
        }
        return help;

    }
}
