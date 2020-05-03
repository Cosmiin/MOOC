package week4.Exercise79;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while (true) {
            int x = reader.nextInt();
            if (x < 0) {
                break;
            } else {
                stats.addNumber(x);
            }if(x%2==0){
                even.addNumber(x);
            }else{
                odd.addNumber(x);
            }

        }


        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
        System.out.println("average: " + stats.average());

    }
}






