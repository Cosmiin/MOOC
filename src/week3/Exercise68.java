package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise68 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }

    }

    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        boolean z = false;
        int x = 0;
        for (int i = 0; i < list.size(); i++) {
            int j = list.get(i);
            if (j == number) {
                x++;
            }
            if (x >= 2) {
                z = true;
            }
        }
        return z;
    }

}
