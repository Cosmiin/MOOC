package week3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> listaCuvinte = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word");
            String text = reader.nextLine();

            if (text.isEmpty()) {
                System.out.println("You typed the following words");
                listaCuvinte.sort(Comparator.naturalOrder());
                for (int i = 0; i < listaCuvinte.size(); i++) {
                    System.out.println(listaCuvinte.get(i));
                }
            } else {
                listaCuvinte.add(text);
            }
        }

    }
}
