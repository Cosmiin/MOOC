package week4;

import java.util.ArrayList;

public class Exercise70 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);
        System.out.println(list1);
        System.out.println(list2);
        combine(list1, list2);

    }

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
        first.addAll(second);
        System.out.println(first);

    }

}
