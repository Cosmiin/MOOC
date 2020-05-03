package week4.Exercise79;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while (true) {
            int x = reader.nextInt();
            if (x < 0) {
                break;
            }else{
                stats.addNumber(x);
            }

        }


        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());

    }
}




