package week4.exercise72;

import libs.Account;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercise72dot3 {
    public static void main(String[] args) {
        Account A = new Account("Matt", 100);
        Account B = new Account("Cosmin", 0);
        Account C = new Account("Cosmin", 0);
        Scanner reader = new Scanner(System.in);
        System.out.println("Type an amount to transfer");
        double howMuch = reader.nextDouble();
        transfer(A,B,howMuch);
        System.out.println("A new balance is: "+ A.balance());
        System.out.println("B new balance is: "+ B.balance());
        System.out.println("----------------------------------");
        System.out.println("Type an amount to transfer");
        howMuch = reader.nextDouble();
        transfer(B,C,howMuch);
        System.out.println("B new balance is: "+ B.balance());
        System.out.println("C new balance is: "+C.balance());



    }
    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
