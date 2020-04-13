package week2.exercise42;

import hangman.Hangman;

import java.util.Scanner;

public class Exercise42dot1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printMenu();
        System.out.println("");

        while (hangman.gameOn()) {
            System.out.println("Type a command: ");
            String command = reader.nextLine();
            if (command.equalsIgnoreCase("quit")){
              break;
            }else{
                System.out.println("Do not quit");
            }
        }
        System.out.println("Thank you for playing!");

    }
    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }

}
