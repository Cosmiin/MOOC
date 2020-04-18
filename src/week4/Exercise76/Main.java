package week4.Exercise76;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Menu casaAlba = new Menu(lista);

        casaAlba.addMeal("Pizza");
        casaAlba.addMeal("Pizza2");
        casaAlba.addMeal("Pizza3");
        casaAlba.printMeals();



    }
}