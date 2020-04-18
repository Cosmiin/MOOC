package week4.Exercise76;

import java.util.ArrayList;

public class Menu {
private ArrayList<String>meals;

    public Menu(ArrayList<String> meals) {
        this.meals = meals;
    }

    public void addMeal(String meal){
        meals.add(meal);
    }

    public void printMeals(){
        for (String x:meals) {
            System.out.println(x);
        }

    }

    public void clearMenu (){
        meals.removeAll(meals);
    }

}


