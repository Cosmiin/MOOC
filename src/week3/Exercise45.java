package week3;

import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System. in);
        System.out.println("Type number 1: ");
        int number1 =reader.nextInt();
        System.out.println("Type number 2");
        int number2 = reader.nextInt();
        System.out.println("Type number 3");
        int number3 = reader.nextInt();
        int answer =greatest(number1,number2,number3);

        System.out.println("Greatest: "+ answer);


    }

    public static int greatest (int number1 , int number2,int number3){
        int answer = 0;
        if (number1==number2&&number2==number3){
            answer = number1;
        }
        else{
            answer =Math.max(Math.max(number1,number2),number3);
        }
        return answer;
    }

}


