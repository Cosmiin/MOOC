package week4.Exercise80;

import java.util.Random;

public class Dice {
        private Random random;
        private int numberOfSides;

        public Dice(int numberOfSides){
            this.numberOfSides = numberOfSides;
            random = new Random();

        }

        public int roll() {
           Random roll = new Random();
           int x = roll.nextInt(numberOfSides+1);
           return x;
        }
    }

