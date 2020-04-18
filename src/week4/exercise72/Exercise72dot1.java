package week4.exercise72;

import libs.Account;

public class Exercise72dot1 {
    public static void main(String[] args) {
        Account cosminAccount= new Account("Cosmin",100);
        System.out.println("Cosmin's account balance is "+cosminAccount.balance());
        cosminAccount.deposit(20);
        System.out.println("Cosmin's account balance is "+cosminAccount.balance());

    }
}
