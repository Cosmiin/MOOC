package week4.Exercise82;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random randomNumbers = new Random();
        int numberRandom;
        if(numbers.size()==7){
            numbers.removeAll(numbers);
        }
        for (int i = 0; i <7 ; i++) {
           numberRandom =randomNumbers.nextInt(39)+1;
            if(numbers.contains(numberRandom)){
                i--;
                numbers.remove(new Integer(numberRandom));
            }
        numbers.add(numberRandom);

    }
        System.out.println(numbers);
}

    public boolean containsNumber(int number) {
        Scanner reader = new Scanner(System.in);
        number = reader.nextInt();
        if(numbers.contains(number)){
            System.out.println("Got one!");
            return true ;

        }else
            System.out.println("Didn't got one!");
            return false;


        }

        }


