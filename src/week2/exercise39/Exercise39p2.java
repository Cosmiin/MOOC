package week2.exercise39;

public class Exercise39p2 {
    public static void main(String[] args) {
        printSquare(20);
    }

    public static void printStars(int x) {
        for (int i = 0; i < x; i++) {

            System.out.print("*");

        }
        System.out.println();

    }

    public static void printSquare(int sideSize) {
        for (int i = 0; i <sideSize ; i++) {
            printStars(sideSize);
        }
        System.out.println();

    }
}

