package week3;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System. in);
        System.out.println("Type number 1: ");
        int number1 =reader.nextInt();
        System.out.println("Type number 2");
        int number2 = reader.nextInt();
        int answer =least(number1,number2);

        System.out.println("Least: "+ answer);


    }

    public static int least (int number1 , int number2){
        int answer = 0;
        if (number1==number2){
            answer = number1;
        }
        else{
            answer =Math.min(number1,number2);
        }
        return answer;
    }

}
