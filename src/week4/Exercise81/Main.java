package week4.Exercise81;

public class Main {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(15);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
