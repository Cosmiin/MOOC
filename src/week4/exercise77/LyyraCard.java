package week4.exercise77;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has "+ balance +" euros";
    }

    public void payEconomical (){
        if (balance<2.5){
            System.out.println("You don't have enough money");
        }else
        balance = balance-2.5;

    }

    public void payGourment (){
        if(balance<4.0){
            System.out.println("You don't have enough money");
        }else
        balance = balance-4.0;
    }

    public void loadMoney (double amount) {
        if(amount<0){
            amount=0;
            }
        balance=balance+amount;
        if (balance>150){
            System.out.println("You card has max amount");
        }
    }
}
