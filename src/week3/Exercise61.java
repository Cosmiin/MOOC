package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args) {
        ArrayList<String>listaFructe=new ArrayList<String>();
        listaFructe.add("Mere");
        listaFructe.add("Pere");
        listaFructe.add("Banane");
        listaFructe.add("Cirese");
        listaFructe.add("Prune");
        System.out.println("There are this manny items in the list");
        System.out.println(countItems(listaFructe));
    }
    public static int countItems(ArrayList<String>lista){
        int i =lista.size();
        return i;
    }
}
