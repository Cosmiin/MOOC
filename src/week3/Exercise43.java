package week3;

import java.util.Scanner;

public class Exercise43 {

    public static int sum (int number1, int number2, int number3, int number4){
      int sum = (number1+number2+number3+number4);
        return sum;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 4 numbers");
        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        int number3 = reader.nextInt();
        int number4 = reader.nextInt();

        System.out.println(sum(number1,number2,number3,number4));
    }
}
