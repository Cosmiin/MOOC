package week2.exercise40;

public class Exercise40dot3 {
    public static void main(String[] args) {
        xmasTree(5);



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

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);

        }
    }

    public static void xmasTree(int height) {
        int j = 0;
        int i;
            for (i = 1; i <= height; i++) {
            printWhitespaces(height - i);
            printStars(j + i);
            j++;
            if(i==height) {
                printWhitespaces(((i + j) / 2)-2);
                printStars(3);
                printWhitespaces(((i + j) / 2)-2);
                printStars(3);
            }
        }
    }
}








