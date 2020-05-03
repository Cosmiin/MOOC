package week5.Exercise86;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        double payEconomical = 2.5;
        if (cashGiven >= payEconomical) {
            cashInRegister += 2.5;
            this.economicalSold++;
            return cashGiven - payEconomical;
        } else {
            return cashGiven;
        }
    }


    public double payGourmet(double cashGiven) {
        double payGourmet = 4;
        if (cashGiven >= payGourmet) {
            cashInRegister += 4;
            this.gourmetSold++;
            return cashGiven - payGourmet;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        double payEconomical = 2.5;
        if (payEconomical <= card.getBalance()) {
            card.setBalance(card.getBalance()-payEconomical);
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double payGourmet = 4;
        if (payGourmet <= card.getBalance()) {
            card.setBalance(card.getBalance()-payGourmet);
            this.gourmetSold++;
            return true;
        }else {
            return false;
        }
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
        card.setBalance(card.getBalance()+sum);
    }


    public String toString() {
        return "money in register " + cashInRegister + "\n economical lunches sold: " + economicalSold + "\n gourmet lunches sold: " + gourmetSold;
    }

}
