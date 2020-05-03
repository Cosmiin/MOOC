package week6.Exercise104;

import java.util.Arrays;

public class Exercise104 {
    public static void main(String[] args) {
        int[] values = {-1, 6, 9, 8, 12};
        int []valuesBianca ={-1, 6, 9, 8, 12};
        int []values2 ={3, 2, 5, 4, 8};
//        System.out.println("smallest: " + smallest(values));
////      System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
//        System.out.println(indexOfTheSmallestStartingFrom(valuesBianca,1));

        swap(values2, 1, 0);
        System.out.println( Arrays.toString(values2) );
    }

    public static int smallest (int[] array) {
        int s = array[0];
        for (int i = 0; i < array.length; i++) {
            if(s>array[i]){
                s=array[i];
            }
        }
        return s;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index=0;
        for (int i = 0; i <array.length ; i++) {
            if(smallest(array)==array[i]){
                index=i;
               break;
            }
        }return index;
    }

    public static int indexOfTheSmallestB(int[] array) {
        int s = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (s > array[i]) {
                s = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
            int s = array[index];
            int indexB=index;
            for (int i = index; i < array.length; i++) {
                if(s>array[i]){
                    s=array[i];
                    indexB=i;
                }
        }
            return indexB;
    }

    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        array[index1] =array[index2];
        array[index2] = a;
    }

}
