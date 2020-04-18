package week4.exercise72;

import libs.Account;

public class Exercise72dot2 {
    public static void main(String[] args) {
        Account mattAccount = new Account("Matt",1000);
        Account myAccount = new Account("Cosmin",0);
        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattAccount.balance());
        System.out.println(myAccount.balance());


    }
}