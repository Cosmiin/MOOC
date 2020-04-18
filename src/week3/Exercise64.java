package week3;

import java.util.ArrayList;

public class Exercise64 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("The sum: " + sum(list));
        System.out.println(list.size());
        System.out.println("The average: "+ average(list));
        list.add(10);
        System.out.println("the sum: " + sum(list));
        System.out.println(list.size());
        System.out.println("The average: "+ average(list));



    }
    public static int sum(ArrayList<Integer> lista){
        int x =0;
        for (int i = 0; i <lista.size() ; i++) {
            x=x+lista.get(i);
        }
        return x;

    }
    public static double average (ArrayList<Integer>lista){
        double x =0;
        x= (double)sum(lista)/(double) lista.size();
        return x;
    }
}
