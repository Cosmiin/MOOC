package week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username");
        String username = reader.nextLine();
        System.out.println("Type your password");
        String password = reader.next();

        if (((username.equalsIgnoreCase("alex")
                && password.equalsIgnoreCase("mightyducks")))
                ||( username.equalsIgnoreCase("emily") && password.equalsIgnoreCase("cat"))) {

            System.out.println("You're in!");
        } else {
            System.out.println("Your password or username is wrong");
        }
    }
}
