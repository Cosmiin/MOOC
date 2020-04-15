package week2.exercises25to38;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        System.out.println("First: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        System.out.println("Last: ");
        int num1 = reader.nextInt();
        int sum = 0;

        while (num <= num1) {
            sum+=num;
            num++;
            }
        System.out.println(sum);
    }

}
