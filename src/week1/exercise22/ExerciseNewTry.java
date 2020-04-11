package week1.exercise22;

import java.util.Scanner;

public class ExerciseNewTry {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.println("please type the password");
            String password = reader.next();
            if (password.equalsIgnoreCase("carrot")){
                System.out.println("Correct password");
                break;
            }
            System.out.println("Wrong password");
        }
    }
}
