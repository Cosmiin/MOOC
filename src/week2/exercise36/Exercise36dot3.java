package week2.exercise36;

import java.util.Scanner;

public class Exercise36dot3 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int sum=0;
        int counter=0;


        while (num!=-1){
            System.out.println("Type another number: ");
            sum=sum+num;
            counter++;
            num =reader.nextInt();

        }  if (num==-1){
            System.out.println("Thank you and see you later");
            System.out.println("The sum is "+ sum);
            System.out.println("How manny numbers: " + counter);
        }


    }
}
