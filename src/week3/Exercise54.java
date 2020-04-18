package week3;

import java.util.Scanner;

public class Exercise54 {
         public static void main(String[] args) {
            System.out.println("Type your name: ");
            Scanner reader = new Scanner(System.in);
            String name = reader.next();
            System.out.println("Type the lenght of the last part");
            int lastParts = reader.nextInt();
             lastPart(name,lastParts);

        }
        public static void lastPart(String name, int lastPart){
            System.out.println(name.substring(name.length()-lastPart,name.length()));
             }
    }

