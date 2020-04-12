package week2.exercise40;

public class Exercise40dot2 {
    public static void main(String[] args) {
        printTriangle(4);


    }

    public static void printStars(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size){
            for (int i = 1; i <=size ; i++) {
            printWhitespaces(size-i);
            printStars(i);

        }
    }



}