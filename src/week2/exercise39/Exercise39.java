package week2.exercise39;

public class Exercise39 {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

    public static void printStars(int x) {
        for (int i = 0; i < x; i++) {

            System.out.print("*");

        }
        System.out.println();

    }
}
