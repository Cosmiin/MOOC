package week4.exercise77;

public class Main {
        public static void main(String[] args) {
            LyyraCard Pekka = new LyyraCard(20);
            LyyraCard Brian = new LyyraCard(30);
            LyyraCard card = new LyyraCard(2);

            Pekka.payGourment();
            Brian.payEconomical();
            System.out.println(Pekka);
            System.out.println(Brian);
            Pekka.loadMoney(20);
            Brian.payGourment();
            System.out.println(Pekka);
            System.out.println(Brian);
            Pekka.payEconomical();
            Pekka.payEconomical();
            Brian.loadMoney(50);
            System.out.println(Brian.toString());
            Pekka.toString();





//            System.out.println(card);
//            card.payEconomical();
//            System.out.println(card);
//
//            card.payGourment();
//            card.payEconomical();
//            System.out.println(card);
//            card.loadMoney(-1);
//            System.out.println(card);
        }
    }

