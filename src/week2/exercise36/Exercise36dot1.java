package week2.exercise36;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Exercise36dot1 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();


      while (num!=-1){
          System.out.println("Type another number: ");
          num =reader.nextInt();
      }  if (num==-1){
            System.out.println("Thank you and see you later");
        }


        }
    }

