package week3;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise66 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        list.add(13);
        list.add(22);

        System.out.println("The greatest number is: " + greatest(list));

    }
    public static int greatest (ArrayList<Integer>list){
        int greatest =0;
        list.sort(Comparator.naturalOrder());
        greatest =list.get(list.size()-1);
        return greatest;
    }
}
