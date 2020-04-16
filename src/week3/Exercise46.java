package week3;

import java.io.InputStream;
import java.util.Scanner;

public class Exercise46 {
    public static void main(String[] args) {
        System.out.println("Type 4 numbers");
        Scanner reader = new Scanner(System.in);
        int number1= reader.nextInt();
        int number2= reader.nextInt();
        int number3= reader.nextInt();
        int number4= reader.nextInt();

        System.out.println("The average of the numbers is: "+ average(number1,number2,number3,number4));


    }




    public static double average (int number1, int number2, int number3, int number4){
        double average = (double)(sum(number1,number2,number3,number4))/4;

       return average;
    }

    public static int sum (int number1, int number2, int number3, int number4){
        int sum = (number1+number2+number3+number4);
        return sum;
    }
}
