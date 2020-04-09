package week1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
 String name = reader.next();


        System.out.println("Type your age:" );
        int age = reader.nextInt();

        System.out.println("Type your name: ");
        String name1 = reader.next();
        System.out.println("Type your age:" );
        int age1 = reader.nextInt();

        System.out.printf("%s and %s are %d years in total",name,name1,age+age1);


    }
}
