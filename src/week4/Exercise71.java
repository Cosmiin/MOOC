package week4;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise71 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(3);
        list2.add(7);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("urmeaza bianca!!!!!!!!!");
        smartCombineB(list1,list2);
        System.out.println("----------------------");
        smartCombine(list1, list2);
    }
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
        first.addAll(second);
       first.sort(Comparator.naturalOrder());
        for (int i = 0; i <first.size()-1; i++)
            if (first.get(i).equals(first.get(i + 1)))
                first.remove(i);
        System.out.println(first);

    }
    public static void smartCombineB(ArrayList<Integer> first, ArrayList<Integer> second){
            for (int i = 0; i <second.size(); i++){
            if (first.contains(second.get(i))==false){
                first.add(second.get(i));
            }
            }
                System.out.println(first);

    }
    }


