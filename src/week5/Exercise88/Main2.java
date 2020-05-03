package week5.Exercise88;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        boolean x = true;
        while (x == true) {
            System.out.print("Print name");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                x=false;
            } else {
                System.out.print("Print studentNumber");
                String studentName = reader.nextLine();
                Student student = new Student(name, studentName);
                list.add(student);
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));

        }
    }
}

