package week1.exercise22;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        System.out.print("Type the password: ");
        String pass = reader.next();
        int i =0;
        if (password.equalsIgnoreCase(pass)){
            System.out.print("Right! \n \nThe secret is: jryy qbar ");
        }
        else {
            System.out.println("Wrong!");
            ++i;
        }
        while (i>0){
            System.out.println("Type the password: ");
            pass = reader.next();
            if (password.equalsIgnoreCase(pass)){
                System.out.println("Right! \n \nThe secret is: jryy qbar ");
                i=0;
            }
            else {
                System.out.print("Wrong!");
                ++i;
            }
        }
    }
}


