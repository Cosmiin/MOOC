package week3;

import java.util.ArrayList;

public class Exercise67 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));


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
    public static double variance (ArrayList<Integer>list){
        double v1 =0;
        double variance =0;
        for (int i = 0; i <list.size() ; i++) {
            v1 +=(Math.pow(list.get(i)-average(list),2));
        }
        variance=v1/(list.size()-1);
        return variance;
    }
}