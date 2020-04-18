package week3;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise62 {
    public static void main(String[] args) {
        ArrayList<String>brothers =new ArrayList<String>();
        brothers.add("Mike");
        brothers.add("Jake");
        brothers.add("John");
        brothers.add("Chris");

        System.out.println("brothers");
        System.out.println(brothers);
        System.out.println("Does it work");
        sort(brothers);
        removeLast(brothers);
        System.out.println(brothers);
    }
    public static void sort (ArrayList<String>lista){
        lista.sort(Comparator.naturalOrder());
    }
    public static void removeLast(ArrayList<String>lista){
        lista.remove(lista.size()-1);
    }
}
