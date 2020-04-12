package week2.exercise39;

public class Exercise39p4 {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printStars(int x) {
        for (int i = 0; i < x; i++) {

            System.out.print("*");

        }
        System.out.println();

    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }
}


