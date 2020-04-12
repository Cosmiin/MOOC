package week2.exercise40;

public class Exercise40dot1 {
    public static void main(String[] args) {
        printWhitespaces(2);

    }
    public static void printStars(int x) {
        for (int i = 0; i < x; i++) {

            System.out.print("*");

        }
        System.out.println();

    }
    public static void printWhitespaces (int size){
        for (int i = 0; i <size; i++) {
            System.out.print(" ");
        }

    }
}
