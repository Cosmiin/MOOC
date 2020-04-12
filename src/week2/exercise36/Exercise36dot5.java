package week2.exercise36;

import java.util.Scanner;

public class Exercise36dot5 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int sum=0;
        int counter=0;
        double average =0;
        int even =0;
        int odd =0;


        while (num!=-1){
            System.out.println("Type another number: ");
            sum=sum+num;
            counter++;
            average =(double) sum/(double)counter;
            num =reader.nextInt();
            if(num%2==0){
                even++;
            } else {
                odd++;
            }

        }  if (num==-1){
            System.out.println("Thank you and see you later");
            System.out.println("The sum is "+ sum);
            System.out.println("How manny numbers: " + counter);
            System.out.println("Average " + average);
            System.out.println("Even numbers " + even);
            System.out.println("Odd numbers " + odd);
        }


    }
}

