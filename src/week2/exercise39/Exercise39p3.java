package week2.exercise39;

public class Exercise39p3 {
    public static void main(String[] args) {
        printRectangle(17, 6);
    }

    public static void printStars(int x) {
        for (int i = 0; i < x; i++) {

            System.out.print("*");

        }
        System.out.println();

    }

    public static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
        System.out.println();

    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }

    }
}



