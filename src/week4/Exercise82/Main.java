package week4.Exercise82;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");

        lotteryNumbers.drawNumbers();
        lotteryNumbers.drawNumbers();
        lotteryNumbers.drawNumbers();



    }
}
