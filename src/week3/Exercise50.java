package week3;

import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        firstThreeLetters(name);


       }
       public static void firstThreeLetters(String name) {

           if (name.length()<=2){
               System.out.println("");
           }else {
               String character1 = " " + name.charAt(0);
               String character2 = " " + name.charAt(1);
               String character3 = " " + name.charAt(2);
               System.out.println("1. character: " + character1);
               System.out.println("2. character: " + character2);
               System.out.println("3. character: " + character3);
           }
           ;

       }



    }
