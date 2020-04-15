package week2.exercises25to38;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int result=0;
        int x =0;
        int sum=0;

        while (x<=num){
            result += (int) Math.pow(2,x);
//            sum =sum+result;
            x++;


        }
        System.out.println("The result is: "+ result);
//        System.out.println("The result is: "+ sum);

    }


}
